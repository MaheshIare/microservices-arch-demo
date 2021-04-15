/**
 * 
 */
package com.java.techhub.zuul.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author mahes
 *
 */
@SpringBootApplication
@EnableZuulProxy
@RefreshScope
public class SpringBootZuulGatewayApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulGatewayApplication.class, args);
	}

}
