package com.feelingware.test.springmvc_hibernate_test.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.feelingware.test.springmvc_hibernate_test.entity.User;
import com.feelingware.test.springmvc_hibernate_test.service.UserService;

/**
 *  UserController.java
 *  Description:
 *  
 *  CreateDate: 2017年2月25日 下午1:28:20
 *  @author 马宁波
 */
@Controller
@RequestMapping("/user")
public class UserController {
	private static final Logger LOGGER = Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/showInfo/{userId}")
	public String showUserInfo(ModelMap modelMap, @PathVariable Integer userId){
		LOGGER.info("查询用户：" + userId);
		User userInfo = userService.load(userId);
		modelMap.addAttribute("userInfo", userInfo);
		return "/user/showInfo";
	}
	
	@RequestMapping("/showInfos")
	public @ResponseBody List<User> showUserInfos(){
		LOGGER.info("查询用户全部用户");
		List<User> userInfos = userService.findAll();
		return userInfos;
	}
}
