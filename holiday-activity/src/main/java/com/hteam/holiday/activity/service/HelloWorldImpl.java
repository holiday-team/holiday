package com.hteam.holiday.activity.service;

import java.util.List;

import com.hteam.holiday.activity.dao.HelloWorldDao;

public class HelloWorldImpl implements HelloWorld {

	private HelloWorldDao helloWorldDao;
	
	@Override
	public String sayHello(String name) {
		List<Integer> ids = helloWorldDao.findAllRegionId();
		System.out.println(ids);
		return "Hello, " + name;
	}

	public void setHelloWorldDao(HelloWorldDao helloWorldDao) {
		this.helloWorldDao = helloWorldDao;
	}

	
}
