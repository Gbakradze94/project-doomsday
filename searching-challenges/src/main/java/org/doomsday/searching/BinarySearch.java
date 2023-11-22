package org.doomsday.searching;

public class BinarySearch {
    public int binarySearchRecursive(int[] array, int key, int low, int high) {
        int middle = low + ((high - low) / 2);

        if (high < low) {
            return -1;
        }
        if (key == array[middle]) {
            return middle;
        } else if (key < array[middle]) {
            return binarySearchRecursive(array, key, low, middle -1);
        } else {
            return binarySearchRecursive(array, key, middle + 1, high);
        }
    }
}