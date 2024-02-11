package com.smart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartContactManagerApplication {
	
	private static final Logger logInfo=LoggerFactory.getLogger(SmartContactManagerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SmartContactManagerApplication.class, args);
		
		logInfo.info("Main class");
		logInfo.debug("Debug main class");
		
	}

}
