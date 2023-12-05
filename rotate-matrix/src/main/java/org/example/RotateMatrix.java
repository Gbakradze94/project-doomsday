package org.example;

public class RotateMatrix {

    public static boolean rotateWithTranspose(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("The given matrix cannot be null or empty");
        }

        if (matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("The given matrix must be n x n");
        }

        transpose(matrix);

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0, k = matrix[0].length - 1; j < k; j++, k--) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[k][i];
                matrix[k][i] = temp;
            }
        }

        return true;
    }

    /*
      0 1
      2 5

      1 5
      0 2
     */

    private static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}