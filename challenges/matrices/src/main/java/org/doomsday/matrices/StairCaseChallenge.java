package org.doomsday.matrices;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps.
 * In how many distinct ways can you climb to the top?
 * <p>
 * Example 1:
 * <p>
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 * <p>
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * has context menu
 */
public class StairCaseChallenge {

    public static void main(String[] args) {
        System.out.println(calculateWays(1));
    }

    // 1 2 3 5 8 ...
    public static int calculateWays(int stairCount) {
        if (stairCount == 1) {
            return 1;
        } else if (stairCount == 2) {
            return 2;
        }
        int[] numberOfWays = new int[stairCount + 1];
        numberOfWays[0] = 0;
        numberOfWays[1] = 1;
        numberOfWays[2] = 2;
        for (int i = 3; i < stairCount + 1; i++) {
            numberOfWays[i] = numberOfWays[i - 1] + numberOfWays[i - 2];
        }
        return numberOfWays[stairCount];
    }
}
