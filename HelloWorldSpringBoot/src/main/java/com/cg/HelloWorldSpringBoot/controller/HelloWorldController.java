package com.cg.HelloWorldSpringBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/greet")
public class HelloWorldController {
	@RequestMapping(value="/hello")
	public String hello(){
		return "Hello World!!";
	}
}
