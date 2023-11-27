package org.doomsday.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDuplicateCharsTest {

    private CountDuplicateChars countDuplicateChars;

    @BeforeEach
    void init() {
        countDuplicateChars = new CountDuplicateChars();
    }

    @Test
    void whenIncludesDuplicates_returnCountOfDuplicates() {
        String account = "account";
        int numberOfDuplicateChars = 2;
        Integer integer = countDuplicateChars.countDuplicateCharacters(account).get('c');
        assertEquals(numberOfDuplicateChars, integer);
    }
}