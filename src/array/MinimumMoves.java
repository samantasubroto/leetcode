package array;

import java.util.Arrays;

public class MinimumMoves {
    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;

        for(int i=0;i<seats.length;i++) {
            moves += Math.abs(seats[i] - students[i]);
        }
        return moves;
    }

    public static void main(String[] args) {
        System.out.println(minMovesToSeat(new int[]{4,1,5,9}, new int[]{1,3,2,6}));
    }
}
