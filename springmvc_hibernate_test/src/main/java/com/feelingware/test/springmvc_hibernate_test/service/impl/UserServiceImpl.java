package com.feelingware.test.springmvc_hibernate_test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feelingware.test.springmvc_hibernate_test.dao.base.UserDao;
import com.feelingware.test.springmvc_hibernate_test.entity.User;
import com.feelingware.test.springmvc_hibernate_test.service.UserService;

/**
 *  UserServiceImpl.java
 *  Description:
 *  
 *  CreateDate: 2017年2月25日 上午11:15:05
 *  @author 马宁波
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public User load(Integer id) {
		return userDao.load(id);
	}

	@Override
	public User get(Integer id) {
		return userDao.get(id);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public void persist(User entity) {
		userDao.persist(entity);
	}

	@Override
	public Integer save(User entity) {
		return userDao.save(entity);
	}

	@Override
	public void saveOrUpdate(User entity) {
		userDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		userDao.delete(id);
	}

	@Override
	public void flush() {
		userDao.flush();
	}
}
