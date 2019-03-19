package com.jojo.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jojo.common.entity.Test;
import com.jojo.provider.service.TestService;

@RestController
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping(value="/helloCloud")
	public Test helloCloud(){
		Test t = testService.getById(1);
		return t;
	}
}
