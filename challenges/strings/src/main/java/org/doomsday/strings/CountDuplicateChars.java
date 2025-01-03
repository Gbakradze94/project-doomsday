package org.doomsday.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Anghel Leonard ©
 */
public class CountDuplicateChars {

    public Map<Character, Integer> countDuplicateCharacters(String string) {
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char character = string.charAt(i);

            result.compute(character, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }
}
