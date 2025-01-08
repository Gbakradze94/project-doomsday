package org.doomsday.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    private final PalindromeChecker palindromeChecker = new PalindromeChecker();

    @Test
    void testIsPalindrome() {
        String palindromeCandidate = "civic";
        assertTrue(palindromeChecker.isPalindrome(palindromeCandidate));
    }

}