package com.duttech.RoutingPractice;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

@RequestMapping("/coding")

public class CodingController {
	
	@RequestMapping("")
	public String greeting() {
		return "Hello Coding Dojo";
	}
	
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is Better";
	}
	

}
