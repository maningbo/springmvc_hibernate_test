package com.feelingware.test.springmvc_hibernate_test.dao;

import java.io.Serializable;
import java.util.List;

/**
 *  GenericDao.java
 *  Description:
 *  
 *  CreateDate: 2017年2月25日 上午10:20:24
 *  @author 马宁波
 */
public interface BaseDao<T, PrimaryKey extends Serializable> {
	T load(PrimaryKey id);
	
	T get(PrimaryKey id);
	
	List<T> findAll();
	
	void persist(T entity);
	
	PrimaryKey save(T entity);
	
	void saveOrUpdate(T entity);
	
	void delete(PrimaryKey id);
	
	void flush();
}
