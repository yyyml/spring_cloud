package com.jojo.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class Zfilter extends ZuulFilter{

	/**
	 * 是否应该执行该过滤器，如果是false，则不执行该filter
	 */
	@Override
	public boolean shouldFilter() {
		
		return true;
	}

	/**
	 * 执行业务操作，可执行sql,nosql等业务
	 */
	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();  
        HttpServletRequest request = ctx.getRequest();  
		
        if (1 == 1) {
        	ctx.setSendZuulResponse(true);//会进行路由，也就是会调用api服务提供者
        	ctx.setResponseStatusCode(200);
        	ctx.set("isOK", true);//可以把一些值放到ctx中，便于后面的filter获取使用
		}else {
			ctx.setSendZuulResponse(false);//不需要进行路由，也就是不会调用api服务提供者
        	ctx.setResponseStatusCode(401);
        	ctx.set("isOK", false);//可以把一些值放到ctx中，便于后面的filter获取使用
        	//返回内容给客户端
        	ctx.setResponseBody("{\"result\":\"pre01Filter auth not correct!\"}");// 返回错误内容 
		}
		return null;
	}

	/**
	 * 过滤器类型
	 * 顺序: pre ->routing -> post ,以上3个顺序出现异常时都可以触发error类型的filter
	 */
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return FilterConstants.PRE_TYPE;
	}

	/**
	 * 同filterType类型中，order值越大，优先级越低
	 */
	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
