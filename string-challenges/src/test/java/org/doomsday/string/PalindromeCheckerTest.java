package org.doomsday.string;

import org.doomsday.string.PalindromeChecker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeCheckerTest {

    private PalindromeChecker palindromeChecker;

    @BeforeEach
    public void init() {
       palindromeChecker = new PalindromeChecker();
    }

    @Test
    void whenPalindrome_returnTrue() {
        String civic = "civic";
        assertTrue(palindromeChecker.isPalindrome(civic));
    }

    @Test
    void whenNotPalindrome_returnFalse() {
        String abc = "abc";
        assertFalse(palindromeChecker.isPalindrome(abc));
    }

    @Test
    void whenUpperCasedPalindrome_returnTrue() {
        String civicWithUppercase = "Civic";
        assertTrue(palindromeChecker.isPalindrome(civicWithUppercase));
    }

    @Test
    void whenAllUpperCasedPalindrome_returnTrue() {
        String civicWithAllUppercases = "CIVIC";
        assertTrue(palindromeChecker.isPalindrome(civicWithAllUppercases));
    }

    @Test
    void whenPalindromeWithEmptySpace_returnTrue() {
        String civicWithEmptySpace = "Civic ";
        assertTrue(palindromeChecker.isPalindrome(civicWithEmptySpace));
    }
}