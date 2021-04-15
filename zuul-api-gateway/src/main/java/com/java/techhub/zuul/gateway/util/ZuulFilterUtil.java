/**
 * 
 */
package com.java.techhub.zuul.gateway.util;

/**
 * @author mahes
 *
 */
public final class ZuulFilterUtil {

	private ZuulFilterUtil() {
		
	}
	
	private static final int FILTER_ORDER = 1;
	private static final boolean SHOULD_FILTER = true;
	
	public static int getFilterOrder() {
		return FILTER_ORDER;
	}
	
	public static boolean shouldFilter() {
		return SHOULD_FILTER;
	}
}
