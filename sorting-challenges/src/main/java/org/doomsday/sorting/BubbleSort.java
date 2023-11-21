package org.doomsday.sorting;

import java.util.stream.IntStream;

public class BubbleSort {
    public void bubbleSortWithStreams(Integer[] array) {
        int n = array.length;
        IntStream.range(0, n - 1)
                .flatMap(i -> IntStream.range(1, n - 1))
                .forEach(j -> {
                    if(array[j - 1] > array[j]) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                });
    }

    public void bubbleSortWithForLoop(Integer[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}