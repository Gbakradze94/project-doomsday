package string;

import org.doomsday.string.PalindromeChecker;
import org.doomsday.string.PalindromeCheckerUsingForLoop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeCheckerUsingForLoopTest {
    private PalindromeCheckerUsingForLoop palindromeCheckerUsingForLoop;

    @BeforeEach
    public void init() {
        palindromeCheckerUsingForLoop = new PalindromeCheckerUsingForLoop();
    }

    @Test
    void whenPalindrome_returnTrue() {
        String civic = "civic";
        assertTrue(palindromeCheckerUsingForLoop.isPalindrome(civic));
    }
}
