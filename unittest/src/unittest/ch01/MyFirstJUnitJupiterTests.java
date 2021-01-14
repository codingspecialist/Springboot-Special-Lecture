package unittest.ch01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import unittest.Calculator;



// 사용자 가이드 : https://junit.org/junit5/docs/current/user-guide/
// 사용 함수 : https://howtodoinjava.com/junit5/junit-5-tag-annotation-example/
public class MyFirstJUnitJupiterTests {

	private final Calculator calculator = new Calculator();

	@Test
	void testCaseB() {
		System.out.println("testCaseB");
	}


	@Test
	@Tag("production")
	void addition() {
		System.out.println("addition");
		assertEquals(2, calculator.add(1, 1));
	}
}
