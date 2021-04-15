/**
 * 
 */
package com.java.techhub.zuul.gateway.util;

/**
 * @author mahes
 *
 */
public enum ZuulFilterEnum {

	PRE_FILTER("pre"), POST_FILTER("post"), ROUTE_FILTER("route"), ERROR_FILTER("error");
	
	private String filterType;

	ZuulFilterEnum(String filterType) {
		this.filterType = filterType;
	}
	
	public String getFilterType() {
		return filterType;
	}
}
