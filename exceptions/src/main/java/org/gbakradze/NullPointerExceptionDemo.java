package org.gbakradze;

import java.lang.reflect.Array;

/**
 * NullPointerException is thrown when an application attempts to use
 * null in a case where an object is required.
 * <br/>
 * In the main method below, there are different cases that will
 * produce a NullPointerException. Of course, these cases are
 * not exhaustive and there can be many more.
 */
public class NullPointerExceptionDemo {

    public static void main(String[] args) {
     //  callInstanceMethodOnANullReference();
       takingTheLengthOfANullAsItWereAnArray();
    }

    /** Case 1: Calling the instance method on a null reference
     */
    public static void callInstanceMethodOnANullReference() {
        Integer number = null;
        System.out.println(number.doubleValue());
    }

    /** Case 2: Taking the length of null as if it were an array
     */
    public static void takingTheLengthOfANullAsItWereAnArray() {
        Array array = null;
        System.out.println(Array.getLength(array));
    }
    AutoCloseable
}
