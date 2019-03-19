package com.jojo.provider.config;

import java.util.Date;

import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;

@Component
public class MetaObjectHandlerConfig implements MetaObjectHandler {

	@Override
	public void insertFill(MetaObject metaObject) {
		 Object createTime = getFieldValByName("createAt", metaObject);
	        Object updateTime = getFieldValByName("updateAt", metaObject);
	        if (createTime == null) {
	        	setFieldValByName("createAt",new Date(), metaObject);//mybatis-plus版本2.0.9+	
	        }
	        if (updateTime == null){
	        	setFieldValByName("updateAt",new Date(), metaObject);//mybatis-plus版本2.0.9+
	        }
	}

	@Override
	public void updateFill(MetaObject metaObject) {
		 Object updateTime = getFieldValByName("updateAt", metaObject);
	     if (updateTime == null) {
	       setFieldValByName("updateAt", new Date(), metaObject);//mybatis-plus版本2.0.9+
	     }
	}

}
