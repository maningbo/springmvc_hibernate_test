package com.feelingware.test.springmvc_hibernate_test.service;

import java.util.List;

import com.feelingware.test.springmvc_hibernate_test.entity.User;

/**
 *  UserService.java
 *  Description:
 *  
 *  CreateDate: 2017年2月25日 上午11:13:55
 *  @author 马宁波
 */
public interface UserService {
	User load(Integer id);

	User get(Integer id);

	List<User> findAll();

	void persist(User entity);

	Integer save(User entity);

	void saveOrUpdate(User entity);

	void delete(Integer id);

	void flush();
}
