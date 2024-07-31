package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pivot_Partition {
    public static int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        int countPivot = 0;

        // Partition the elements
        for (int num : nums) {
            if (num < pivot) {
                smaller.add(num);
            } else if (num > pivot) {
                greater.add(num);
            } else {
                countPivot++;
            }
        }

        // Calculate the total size of the result array
        int totalSize = smaller.size() + countPivot + greater.size();
        int[] result = new int[totalSize];

        // Fill the result array
        int index = 0;
        for (int num : smaller) {
            result[index++] = num;
        }
        for (int i = 0; i < countPivot; i++) {
            result[index++] = pivot;
        }
        for (int num : greater) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        pivotArray(new int[]{9, 12, 5, 10, 14, 3, 10}, 9);
    }
}
