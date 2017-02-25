package springmvc_hibernate_test.service_test;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.feelingware.test.springmvc_hibernate_test.entity.User;
import com.feelingware.test.springmvc_hibernate_test.service.UserService;

/**
 *  UserServiceTest.java
 *  Description:
 *  
 *  CreateDate: 2017年2月25日 上午11:19:30
 *  @author 马宁波
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-hibernate.xml" })
public class UserServiceTest {
	private static final Logger LOGGER = Logger
			.getLogger(UserServiceTest.class);

	@Autowired
	private UserService userService;

	@Test
	public void save() {
		/*User user = new User();
		//user.setId(1);
		user.setNickName("你好");
		user.setRegisterTime(new Date());
		user.setTelephone("13111111111");
		Integer id = userService.save(user);
		LOGGER.info(JSON.toJSONString(id));*/
		List<User> findAllUser = userService.findAll();
		for (User user : findAllUser) {
			System.out.println(user.getNickName());
		}
	}
}
