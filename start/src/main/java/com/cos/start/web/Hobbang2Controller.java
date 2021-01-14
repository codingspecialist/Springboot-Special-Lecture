package com.cos.start.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 사용자 요청시에 컴포넌트 스캔 => 
// @Configuration @Component  @Repository @Service    (@RestController @Controller)

// @Configuration => @RestController or @Controller => @Component
@RestController
public class Hobbang2Controller {
	
	Hobbang h;
	
	// DI (의존성 주입)
	public Hobbang2Controller(Hobbang h) {
		this.h = h;
	}
	
	@GetMapping("/kk/eat")
	public String ho() {
		h.eat();
		return "ho() 호출됨";
	}
	
}
