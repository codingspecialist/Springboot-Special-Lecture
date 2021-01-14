package unittest.ch02;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class StandardTests {
	
	@BeforeAll
	static void initAll() {
		System.out.println("@BeforeAll");
	}

	@BeforeEach
	void init() {
		System.out.println("@BeforeEach");
	}

	@Test
	void test1() {
		System.out.println("test1");
	}

	@Test
	void test2() {
		System.out.println("test2");
		//fail("a failing test"); // 여기서 테스트 실패
	}
	
	// Assumptions(가정문) 관련 함수는 테스트 실패시 해당 함수 실행을 그냥 생략한다.
	// 테스트가 생략되는 것이지 테스트가 실패하는 것이 아니다.
	@Test
	void test3() {
		System.out.println("test3");
		assumeTrue("abc".contains("K"));
	}
	
	// assertions(단정문) 관련 함수는 테스트 실패시 그냥 테스트가 실패한다.
	@Test
	void test4() {
		System.out.println("test4");
		assertTrue("abc".contains("K"));
	}

	@Test
	@Disabled("for demonstration purposes")
	void skippedTest() {
		System.out.println("실행안됨 @Disabled, @Test를 안붙이면 되는거 아닌가?");
	}

	@AfterEach
	void tearDown() {
		System.out.println("@AfterEach");
	}

	@AfterAll
	static void tearDownAll() {
		System.out.println("@AfterAll");
	}
}
