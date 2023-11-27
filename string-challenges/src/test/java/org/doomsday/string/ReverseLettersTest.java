package org.doomsday.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLettersTest {

    @Test
    void whenReverseLetters_returnsStringWithReversedLetters() {
        ReverseLetters reverseLetters = new ReverseLetters();
        String inputString = "abcd";
        String reversedString = "dcba";
        assertEquals(reversedString, reverseLetters.reverseLetters(inputString));
    }
}