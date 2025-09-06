package array;

import utils.ArrayUtils;

public class LargestLocalValue_2373 {

    public static int[][] largestLocal(int[][] grid) {
        int[][] maxLocal = new int[grid.length-2][grid.length-2];

        for (int i = 0; i < grid.length-2; i++) {
            for (int j = 0; j < grid.length-2; j++) {
                int maxValue = 0;
                for (int r = i; r < i+3; r++) {
                    for (int c = j; c < j+3; c++) {
                        maxValue = Math.max(maxValue, grid[r][c]);
                    }
                }
                maxLocal[i][j] = maxValue;
            }
        }
        return maxLocal;
    }

    public static void main(String[] args) {
        largestLocal(new int[][] {
                {9,9,8,1},
                {5,6,2,6},
                {8,2,6,4},
                {6,2,2,2}
        });
    }
}
