package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 디스패쳐 서블릿 필터에서 com.example.demo 이하의 모든 패키지를
// 컴포넌트 스캔한다. 이때 찾는 어노테이션 => @Controller @RestController
// 그 클래스에서 GET : / 주소로 매핑된 메서드가 있는지 리플렉션
// @GetMapping, @PostMapping, @PutMapping, @DeleteMapping
// GET으로 했으면 GetMapping이 걸려있는 함수만 찾아내서
// / 로 주소가 걸려있는 함수를 invoke해준다.

// 어딘가에 떳어. heap => 힙을 가리키는 힙 => IoC 컨테이너
// Inversion of Controll = 제어의 역전

// @RestController => return시에 MessageConvertor 동작
//  저 값을 PrintWriter달아서 응답해준다.
// 응답의 값이 일반 String 바로 응답
// 응답의 값이 javaObject이면 json으로 파싱해서 응답

// MessageConvertor(부모) - json관련클래스 extends

// @Controller => return시에 ViewResolver 동작
// hello메시지 앞뒤로 먼가를 붙여서 그 파일을 return 해줍니다. (RequestDispatcher)

// jsp를 할꺼면 직접 viewResolver설정을 prefix, sufix

// src/main/resource/templates/  (prefix)
// 정해져있지 않음.

// RequestDispatcher dis = request.getRequestDispatcher("hello");
// dis.forward(request, response);


// http://localhost:8080/
@RestController
public class IndexController {

	
	@GetMapping("/")
	public String index() {
		System.out.println("index() 호출됨");
		return "hello";
	}
	
	public void hello() {
		
	}
}
