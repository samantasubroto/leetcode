package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiagonallySortMatrix {
    public static void diagonalDown(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i=0;i<rows;i++) {
            int row = i, col = 0;
            List<Integer> list = new ArrayList<>();
            while (row < rows && col < cols) {
                list.add(mat[row][col]);
                row++;
                col++;
            }
            Collections.sort(list);
            row = i; col = 0;
            int idx = 0;
            while (row < rows && col < cols) {
                mat[row][col] = list.get(idx++);
                row++;
                col++;
            }
        }
    }

    public static void diagonalUp(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        for(int i = 1; i < cols; i++) {
            int round = i;
            List<Integer> list = new ArrayList<>();

            for(int j = 0; j < rows && round < cols; j++) {
                list.add(mat[j][round]);
                round++;
            }
            round = i;
            Collections.sort(list);
            for(int j = 0; j < rows && round < cols; j++) {
                mat[j][round] = list.get(j);
                round++;
            }
        }
    }


    public static void diagonalSort(int[][] mat) {
        diagonalDown(mat);
        diagonalUp(mat);
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diagonalSort(new int[][]{{3,9}, {2,4}, {1,2}, {9,8}, {7,3}});
    }
}
