package com.java.techhub.zuul.gateway.filters;

import javax.servlet.http.HttpServletRequest;

import com.java.techhub.zuul.gateway.util.ZuulFilterEnum;
import com.java.techhub.zuul.gateway.util.ZuulFilterUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PreFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return ZuulFilterEnum.PRE_FILTER.getFilterType();
	}

	@Override
	public int filterOrder() {
		return ZuulFilterUtil.getFilterOrder();
	}

	@Override
	public boolean shouldFilter() {
		return ZuulFilterUtil.shouldFilter();
	}

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		log.info("Request Method : {} Request URL : {}", request.getMethod(), request.getRequestURL().toString());
		return null;
	}
}