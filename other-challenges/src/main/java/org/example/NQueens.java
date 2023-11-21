package org.example;

public class NQueens {

    public static void main(String[] args) {
        int boardSize = 4;
        solveNQueens(boardSize);
    }

    public static void solveNQueens(int n) {
        int[][] board = new int[n][n];

        if (placeQueens(board, 0, n)) {
            displayBoard(board);
        } else {
            System.out.println("Solution does not exist for " + n + " queens on a " + n + "x" + n + " board.");
        }
    }

    public static boolean placeQueens(int[][] board, int col, int n) {
        if (col == n) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, col, n)) {
                board[i][col] = 1;
                if (placeQueens(board, col + 1, n)) {
                    return true;
                }
                board[i][col] = 0; // Backtrack
            }
        }
        return false;
    }

    public static boolean isSafe(int[][] board, int row, int col, int n) {
        int i, j;

        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }


        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < n; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void displayBoard(int[][] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}