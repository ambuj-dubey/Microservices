package com.lcwd.gateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {
	private static final Logger logger = LoggerFactory.getLogger(ApiGatewayApplication.class);
	public static void main(String[] args) {
		logger.info("Starting the ApiGatewayApplication...");
		SpringApplication.run(ApiGatewayApplication.class, args);
		logger.info("ApiGatewayApplication started.");
	}

}
