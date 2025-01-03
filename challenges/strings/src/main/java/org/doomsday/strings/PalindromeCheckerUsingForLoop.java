package org.doomsday.strings;

public class PalindromeCheckerUsingForLoop {

    public boolean isPalindrome(String string) {
        char[] charsArray = string.toCharArray();
        int charsArrayLength = charsArray.length;
        char[] reversedString = new char[charsArrayLength];

        int maxIndex = charsArrayLength - 1;
        for (int i = 0; i < charsArray.length; i++) {
            reversedString[i] = charsArray[maxIndex];
            maxIndex--;
        }

        for (int i = 0; i < string.length(); i++) {
            if (reversedString[i] != charsArray[i]) {
                return false;
            }
        }
        return true;
    }
}
