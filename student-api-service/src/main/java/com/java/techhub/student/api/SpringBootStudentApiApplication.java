/**
 * 
 */
package com.java.techhub.student.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author mahes
 *
 */
@SpringBootApplication
@RefreshScope
public class SpringBootStudentApiApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudentApiApplication.class, args);
	}

}
