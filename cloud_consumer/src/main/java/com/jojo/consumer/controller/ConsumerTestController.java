package com.jojo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jojo.common.entity.Test;
import com.jojo.consumer.service.ConsumerTestService;

@RestController
public class ConsumerTestController {

	@Autowired
	private ConsumerTestService consumerTestService;
	
	@RequestMapping(value="/consumerCloud")
	public Test helloCloud(){
		Test t = consumerTestService.helloCloud();
		return t;
	}
}
