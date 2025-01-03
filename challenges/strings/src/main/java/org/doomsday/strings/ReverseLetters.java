package org.doomsday.strings;


public class ReverseLetters {
    public String reverseLetters(String string) {
        char[] characters = new char[string.length()];

        int i = string.length() -1;
        for (char ch : string.toCharArray()) {
            characters[i] = ch;
            i--;
        }
        return String.copyValueOf(characters);
    }
}
