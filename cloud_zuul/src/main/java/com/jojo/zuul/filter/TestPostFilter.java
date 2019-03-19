package com.jojo.zuul.filter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class TestPostFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		//上一个filter设置该值
		return RequestContext.getCurrentContext().getBoolean("isOK");
	}

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();  
        HttpServletRequest request = ctx.getRequest();  
		
        String post = request.getParameter("post");
        System.out.println("执行postFilter .....post=" + post 	);
        
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

	@Override
	public String filterType() {
		return FilterConstants.ROUTE_TYPE;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
