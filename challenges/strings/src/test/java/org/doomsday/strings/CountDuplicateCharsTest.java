package org.doomsday.strings;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountDuplicateCharsTest {

    private final CountDuplicateChars countDuplicateChars = new CountDuplicateChars();

    @Test
    void countDuplicateCharacters() {
        var result = countDuplicateChars.countDuplicateCharacters("civic");
        assertEquals(2, result.get('i'));
    }
}