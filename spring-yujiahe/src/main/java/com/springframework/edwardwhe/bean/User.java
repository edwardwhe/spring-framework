package com.springframework.edwardwhe.bean;


import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

public class User implements InitializingBean {
	private String name;
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public User() {}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", id='" + id + '\'' +
				'}';
	}

	public void init() {
		System.out.println("init");
	}

	@PostConstruct
	public void postConstructor() {
		System.out.println("postConstructor");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}
}
