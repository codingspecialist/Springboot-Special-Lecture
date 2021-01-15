package com.cos.person.ch01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.Extension;

public class TagTest1 implements Extension{

	@Test
	public void 테스트() {
		System.out.println("TagTest1");
	}
}
