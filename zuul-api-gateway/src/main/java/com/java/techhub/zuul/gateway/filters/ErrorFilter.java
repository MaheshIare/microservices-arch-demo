package com.java.techhub.zuul.gateway.filters;

import javax.servlet.http.HttpServletResponse;

import com.java.techhub.zuul.gateway.util.ZuulFilterEnum;
import com.java.techhub.zuul.gateway.util.ZuulFilterUtil;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ErrorFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return ZuulFilterEnum.ERROR_FILTER.getFilterType();
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
		HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
		log.info("ErrorFilter: response status is {}", response.getStatus());
		return null;
	}
}