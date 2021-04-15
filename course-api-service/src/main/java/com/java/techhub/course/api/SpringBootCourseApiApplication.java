/**
 * 
 */
package com.java.techhub.course.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author mahes
 *
 */
@SpringBootApplication
@RefreshScope
@EnableFeignClients(basePackages = { "com.java.techhub.course.api.service.feign" })
public class SpringBootCourseApiApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCourseApiApplication.class, args);
	}

}
