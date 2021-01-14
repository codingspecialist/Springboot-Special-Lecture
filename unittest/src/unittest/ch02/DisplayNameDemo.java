package unittest.ch02;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// 디스플레이 네임은 테스트 성공시나 실패시에 해당 이모지나 글자를 표시할 수 있다.

@DisplayName("A special test case")
class DisplayNameDemo {

    @Test
    @DisplayName("Custom test name containing spaces")
    void testWithDisplayNameContainingSpaces() {
    	System.out.println("응?");
    	fail();
    }

    @Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameContainingSpecialCharacters() {
    }

    @Test
    @DisplayName("😱")
    void testWithDisplayNameContainingEmoji() {
    }

}
