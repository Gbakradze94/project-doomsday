package org.doomsday.string;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Count duplicate characters in a given String
 * using streams.
 * <br/>
 * Author: Anghel Leonard ©
 */
public class CountDuplicateCharsIntStream {

    public Map<Character, Long> countDuplicateCharactersUsingIntStream(String string) {
        return string.chars()
                .mapToObj(character -> (char) character)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}
