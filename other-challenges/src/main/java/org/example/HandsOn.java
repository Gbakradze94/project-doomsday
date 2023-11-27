package org.example;

public class HandsOn {
    final int N;

    public HandsOn(int n) {
        this.N = n;
    }


    void printSolution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    boolean isSafe(int row, int col, int[][] board) {
        int i, j;

        for (i = 0; i < col; i++) {
            if(board[row][i] == 1){
                return false;
            }
        }

        for (i = row, j = col; i >=0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check lower diagonal on the left side
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    boolean solveNQUtil(int[][] board, int col) {
        if (col == N) {
            printSolution(board);
            return true;
        }

        boolean res = false;
        for (int i = 0; i < N; i++) {
            if(isSafe(i, col, board)) {
                board[i][col] = 1;
                res = solveNQUtil(board, col + 1) || res;
                board[i][col] = 0;
            }
        }

        return res;
    }

    void solveNQ() {
        int[][] board = new int[N][N];

        if(!solveNQUtil(board, 0))
            System.out.println("Solution does not exist");
    }

    public static void main(String[] args) {
        int N = 4; // Change N to the desired board size
        HandsOn nq = new HandsOn(N);
        nq.solveNQ();
    }
}

