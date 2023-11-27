package org.doomsday.sorting;


/**
 * Best case O(n log n), Average case O(n log n)
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] unsortedArray = { 52, 28, 91, 19, 76, 33, 43, 57, 20 };
        sort(unsortedArray);
        for (int i: unsortedArray) {
            System.out.println(i);
        }
    }

    public static void sort(int[] array) {
        if (array.length > 1) {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);

            sort(left);
            sort(right);

            merge(array, left, right);
        }
    }

    private static int[] leftHalf(int[] array) {
        int size = array.length / 2;
        int[] left = new int[size];
        System.arraycopy(array, 0, left, 0, size);

        return left;
    }

    private static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }

    private static void merge(int[] result, int[] left, int[] right) {
        int t1 = 0;
        int t2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (t2 >= right.length
                    || (t1 < left.length && left[t1] <= right[t2])) {
                result[i] = left[t1];
                t1++;
            } else {
                result[i] = right[t2];
                t2++;
            }
        }
    }
}
