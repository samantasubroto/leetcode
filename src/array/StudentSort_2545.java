package array;

public class StudentSort_2545 {

    public static void sortTheStudents(int[][] score, int k) {
        System.out.println(score[0].length);
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");
        for (int i = 0; i < score.length - 1; i++) {
            int max = score[i][k];
            int row = i;
            for (int j = i + 1; j < score.length; j++) {
                if (max < score[j][k]) {
                    max = score[j][k];
                    row = j;
                }
            }
            if (row != i) {
                for (int j = 0; j < score[i].length; j++) {
                    int temp = score[i][j];
                    score[i][j] = score[row][j];
                    score[row][j] = temp;
                }

            }
        }
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        sortTheStudents(new int[][]{
                {10, 5, 9, 1},
                {7, 5, 11, 2},
                {4, 8, 3, 15},
                {1, 2, 12, 6}
        }, 2);
    }
}
