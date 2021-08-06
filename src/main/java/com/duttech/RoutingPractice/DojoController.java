package com.duttech.RoutingPractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{location}")
	public String dojoLocations(@PathVariable("location") String location) {
		if (location.equals("dojo")) {
			return "dojo is awesome!";
		}
		
		else if (location.equals("burbank")) {
			return "Burbank Dojo";
		}
		
		else if (location.equals("sanjose")) {
			return "San-jose";
		}
			
			
		return "location";
	}

}
