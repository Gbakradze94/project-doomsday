package org.doomsday.sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BubbleSortTest {

    private static BubbleSort bubbleSort;

    @BeforeAll
    public static void initialize() {
        bubbleSort = new BubbleSort();
    }


    @Test
    void whenBubbleSortWithStreams_shouldReturnSorted() {
        Integer[] unsortedArray = { 50, 40, 30, 20, 10 };
        Integer[] sortedArray = { 10, 20, 30, 40, 50 };
        bubbleSort.bubbleSortWithStreams(unsortedArray);
        assertArrayEquals(sortedArray, unsortedArray);
    }

    @Test
    void whenBubbleSortWithForLoop_shouldReturnSorted() {
        Integer[] unsortedArray = { 50, 40, 30, 20, 10 };
        Integer[] sortedArray = { 10, 20, 30, 40, 50 };
        bubbleSort.bubbleSortWithForLoop(unsortedArray);
        for (Integer i: unsortedArray
             ) {
            System.out.println(i);
        }
        assertArrayEquals(sortedArray, unsortedArray);
    }
}
