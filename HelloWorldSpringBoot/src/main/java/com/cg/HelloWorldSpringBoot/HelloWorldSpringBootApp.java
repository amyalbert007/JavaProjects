package com.cg.HelloWorldSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HelloWorldSpringBootApp {
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSpringBootApp.class, args);
	}
}
