/**
 * 
 */
package com.java.techhub.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author mahes
 *
 */
@SpringBootApplication
@EnableConfigServer
public class SpringBootConfigServerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigServerApplication.class, args);
	}

}
