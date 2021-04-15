/**
 * 
 */
package com.java.techhub.zuul.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.techhub.zuul.gateway.filters.ErrorFilter;
import com.java.techhub.zuul.gateway.filters.PostFilter;
import com.java.techhub.zuul.gateway.filters.PreFilter;
import com.java.techhub.zuul.gateway.filters.RouteFilter;

/**
 * @author mahes
 *
 */
@Configuration
public class ZuulFilterConfig {
	
	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
	
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

}
