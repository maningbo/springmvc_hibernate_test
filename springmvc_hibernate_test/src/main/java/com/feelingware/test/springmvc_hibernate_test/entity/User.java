package com.feelingware.test.springmvc_hibernate_test.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 *  AcctUser.java
 *  Description:
 *  
 *  CreateDate: 2017年2月25日 上午10:16:19
 *  @author 马宁波
 */
@Entity
@Table(name = "user")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class User{
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "nick_name")
	private String nickName;
	
	@Column(name = "telephone")
	private String telephone;
	
	@Column(name = "register_time")
	private Date registerTime;

	public User() {

	}

	public User(Integer id, String nickName) {
		this.id = id;
		this.nickName = nickName;
	}

	public User(Integer id, String nickName, String telephone,
			Date registerTime) {
		this.id = id;
		this.nickName = nickName;
		this.telephone = telephone;
		this.registerTime = registerTime;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
}
