package com.datmt.springcloud.cookservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RefreshScope
public class CookController {


	@Value("${cook.count}")
	int cookCount;
	
	@GetMapping
	public String cook() {
		
		return "Cook count: " + cookCount;  
		
	}

}
