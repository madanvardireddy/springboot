package com.madan.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping(value ="/")
	public static String Welcome() {
		
		return "Spring boot/n"+ "second";
	}

}

