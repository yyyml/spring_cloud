package com.jojo.consumer.service.impl;

import org.springframework.stereotype.Component;

import com.jojo.common.entity.Test;
import com.jojo.consumer.service.ConsumerTestService;

@Component
public class ConsumerTestServiceImpl implements ConsumerTestService{

	@Override
	public Test helloCloud() {
		Test test = new Test();
		test.setName("错误！");
		return test;
	}

}
