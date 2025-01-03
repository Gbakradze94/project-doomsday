package org.doomsday.strings;

/**
 * Palindrome checker implementation using while loop
 */
public class PalindromeChecker {
    public boolean isPalindrome(String string) {

        string = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = string.length() - 1;

        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
