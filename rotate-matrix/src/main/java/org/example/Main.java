package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        matrix[0][0] = 0;
        matrix[0][1] = 1;
        matrix[1][0] = 2;
        matrix[1][1] = 5;
        RotateMatrix rotateMatrix = new RotateMatrix();
        rotateMatrix.rotateWithTranspose(matrix);


    }
}
