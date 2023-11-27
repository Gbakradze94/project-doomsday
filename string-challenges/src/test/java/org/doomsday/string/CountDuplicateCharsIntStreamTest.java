package org.doomsday.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDuplicateCharsIntStreamTest {

    private CountDuplicateCharsIntStream countDuplicateCharsIntStream;

    @BeforeEach
    void init() {
        countDuplicateCharsIntStream = new CountDuplicateCharsIntStream();
    }

    @Test
    void whenIncludesDuplicates_returnCountOfDuplicates() {
        String account = "account";
        char duplicatedCharacter = 'c';
        int numberOfDuplicateChars = 2;
        Long duplicateCount = countDuplicateCharsIntStream.countDuplicateCharactersUsingIntStream(account)
                        .get(duplicatedCharacter);
        assertEquals(numberOfDuplicateChars, duplicateCount);
    }
}
