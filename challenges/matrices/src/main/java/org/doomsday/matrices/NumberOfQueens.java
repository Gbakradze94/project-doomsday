package org.doomsday.matrices;

public class NumberOfQueens {
    private static int N;

    private static void printSolution(int[][] table) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int[][] table, int row, int col) {
        int i, j;

        // Check this row on the left side
        for (i = 0; i < col; i++) {
            if (table[row][i] == 1) {
                return false;
            }
        }

        // Check upper diagonal on the left side

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (table[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on the left side
        for (i = row, j = col; j >=0 && i < N; i++, j--) {
            if (table[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static boolean solveNQueensUtil(int[][] table, int col) {
        if (col >= N) {
            printSolution(table);
            return true;
        }

        boolean result = false;
        for (int i = 0; i < N; i++) {
            if (isSafe(table, i, col)) {
                table[i][col] = 1;

                result = solveNQueensUtil(table, col + 1) || result;

                table[i][col] = 0;  // backtrack is not solved by placing queen here
            }
        }
        return result;
    }

    public static void solveNQueens(int n) {
        N = n;
        int[][] table = new int[N][N];

        if (!solveNQueensUtil(table, 0)){
            System.out.println("Solution does not exist");
        }
    }


    public static void main(String[] args) {
        int n = 4;
        solveNQueens(n);
    }
}
