package org.doomsday.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLettersTest {

    private final ReverseLetters reverseLetters = new ReverseLetters();

    @Test
    void testReverseLetters() {
        String reversedLetters = "CBA";
        assertEquals(reversedLetters, reverseLetters.reverseLetters("ABC"));
    }
}