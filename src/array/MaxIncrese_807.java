package array;

import utils.ArrayUtils;

public class MaxIncrese_807 {
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int maxRow[] = new int[grid.length];
        int maxColumn[] = new int[grid.length];
        int sum = 0;
        for (int i=0;i<maxRow.length;i++) {
            int mRow = 0;
            int mCol = 0;
            for (int j=0;j<maxColumn.length;j++) {
                mRow = Math.max(mRow, grid[i][j]);
                mCol = Math.max(mCol, grid[j][i]);
            }
            maxRow[i] = mRow;
            maxColumn[i] = mCol;
        }

        for (int i=0;i<maxRow.length;i++) {
            for (int j=0;j<maxColumn.length;j++) {
               sum += Math.abs(grid[i][j] - Math.min(maxRow[i], maxColumn[j]));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        maxIncreaseKeepingSkyline(new int[][] {
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        });
    }
}
