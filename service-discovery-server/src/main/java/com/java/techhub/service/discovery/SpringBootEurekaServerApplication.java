/**
 * 
 */
package com.java.techhub.service.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author mahes
 *
 */
@SpringBootApplication
@EnableEurekaServer
@RefreshScope
public class SpringBootEurekaServerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServerApplication.class, args);
	}

}
