package com.jojo.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jojo.common.entity.Test;
import com.jojo.consumer.service.impl.ConsumerTestServiceImpl;

@FeignClient(name="jojo-provider", fallback=ConsumerTestServiceImpl.class)
public interface ConsumerTestService {
	
	@RequestMapping(value="/helloCloud")
	public Test helloCloud();
		
	
}
