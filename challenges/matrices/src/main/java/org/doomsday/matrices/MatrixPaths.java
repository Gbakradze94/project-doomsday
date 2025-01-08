package org.doomsday.matrices;


/**
 * You are given an m*n martix and a starting point (p,q) p is row number, and q is column number.
 * Task is to find the number of ways to reach from (p,q) to (0,0) given the fact that
 * you can only move downwards and rightwards
 */
public class MatrixPaths {
    public int countPaths(int m, int n, int p, int q) {
        // Base case: when at the origin, return 1 way
        if (p == 0 && q == 0) {
            return 1;
        }
        // If out of bounds or before the starting point, return 0 ways
        if (p < 0 || q < 0) {
            return 0;
        }
        // Recursive case: explore paths moving downwards and rightwards
        return countPaths(m, n, p - 1, q) + countPaths(m, n, p, q - 1);
    }

//    public static void main(String[] args) {
//        int m = 2; // Number of rows
//        int n = 2; // Number of columns
//        int p = 1; // Starting row
//        int q = 1; // Starting column
//
//        int totalPaths = countPaths(m, n, p, q);
//        System.out.println("Total possible paths: " + totalPaths);
//    }
}
