package com.cos.start.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HobbangController {

	
	Hobbang h;
	
	// DI (의존성 주입)
	public HobbangController(Hobbang h) {
		this.h = h;
	}

	
	@GetMapping("/ho")
	public String ho() {

		return "ho() 호출됨";
	}
	
	@GetMapping("/ho2")
	public String ho2() {

		return "ho2() 호출됨";
	}
}
