package com.imooc.springapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;


public class SpringapplicationApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(AutoConfigClass.class).web(WebApplicationType.SERVLET);
		SpringApplication.run(AutoConfigClass.class, args);
	}
	@SpringBootApplication
	private static class AutoConfigClass{
		public AutoConfigClass(){};
	}

}
