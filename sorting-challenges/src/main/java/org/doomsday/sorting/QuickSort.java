package org.doomsday.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] unsortedArray = { 7, 3, 10, 59, 2, 1 };
        sort(unsortedArray, 0, 5);
        for (int i : unsortedArray) {
            System.out.println(i);
        }
    }

    public static void sort(int[] array, int left, int right) {
        if (left < right) {
            int m = partition(array, left, right);
            sort(array, left, m - 1);
            sort(array, m + 1, right);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int m = left;
        for (int i = m; i < right; i++) {
            if (array[i] < pivot) {
                swap(array, i , m++);
            }
        }

        swap(array, right, m);
        return m;
    }

    private static void  swap(int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
