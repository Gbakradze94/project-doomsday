package org.doomsday.matrices;

/**
 * You have a p*q matrix, where top left corner is index p-1;q-1 and
 * bottom right corner is 0;0. How many different
 * ways can you reach from top left to bottom
 * right if you can move to the right and down.
 */

public class HandsOnMatrix {


    public static void main(String[] args) {
        System.out.println(countPaths(3,3));
    }
    public static int countPaths(int p, int q) {
        int[][] table = new int[p + 1][q + 1];

        for (int i = 0; i <= p; i++) {
            table[i][0] = 1;
        }
        for (int j = 0; j <= q; j++) {
            table[0][j] = 1;
        }
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= q; j++) {
                table[i][j] = table[i - 1][j] + table[i][j - 1];
            }
        }

        for (int i = 0; i <= p; i++) {
            for (int j = 0; j <= q; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        return table[p][q];
    }

}
