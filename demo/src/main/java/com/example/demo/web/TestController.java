package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
	
	@GetMapping("/test")
	public String test() {
		return "/hello"; // ViewResolver
	}
}
