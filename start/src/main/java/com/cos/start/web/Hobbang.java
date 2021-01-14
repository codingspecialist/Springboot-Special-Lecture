package com.cos.start.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration // 설정과 관련된 객체 (가장 빠르게 리플렉셔됨)
//@Component // 특별한 용도가 없는 객체 = 타이밍이 @Controller, @RestController 뛰우는 타이밍보다 늦음.
public class Hobbang {
	
	public Hobbang() {
	
	}
	
	public void eat() {
		System.out.println("호빵 맛있어");
	}
}
