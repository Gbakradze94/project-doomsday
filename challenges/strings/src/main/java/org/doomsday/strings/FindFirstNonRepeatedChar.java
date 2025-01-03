package org.doomsday.strings;

/**
 * Finding the first non-repeated character
 */
public class FindFirstNonRepeatedChar {
    private static final int EXTENDED_ASCII_CODES = 256;

    public char firstNonRepeatedCharacters(String string) {
        int[] flags = new int[EXTENDED_ASCII_CODES];

        for (int i = 0; i < flags.length; i++) {
            flags[i] = -1;
        }

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
                flags[ch] = -2;
            }
        }

        int position = Integer.MAX_VALUE;
        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
                position = Math.min(position, flags[i]);
            }
        }
        return position == Integer.MAX_VALUE ?
                Character.MIN_VALUE : string.charAt(position);
    }
}
