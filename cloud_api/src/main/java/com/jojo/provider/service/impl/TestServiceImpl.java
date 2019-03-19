package com.jojo.provider.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jojo.common.entity.Test;
import com.jojo.provider.mapper.TestMapper;
import com.jojo.provider.service.TestService;

@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService{

	
	
}
