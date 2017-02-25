package com.feelingware.test.springmvc_hibernate_test.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.feelingware.test.springmvc_hibernate_test.dao.base.UserDao;
import com.feelingware.test.springmvc_hibernate_test.entity.User;

/**
 *  UserDaoImpl.java
 *  Description:
 *  
 *  CreateDate: 2017年2月25日 上午10:37:54
 *  @author 马宁波
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao{
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public User load(Integer id) {
		return (User) this.getCurrentSession().load(User.class, id);
	}
	
	@Override
	public User get(Integer id) {
		return (User) this.getCurrentSession().get(User.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		List<User> Users = this.getCurrentSession().createQuery("from User").setCacheable(true).list();
		return Users;
	}

	@Override
	public void persist(User entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public Integer save(User entity) {
		return (Integer) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(User entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		User entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}
}
