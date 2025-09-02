package array;

import utils.ArrayUtils;

import java.util.*;

public class NumberLessThen_1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] original = nums.clone();
        int[] rows = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            rows[i] = map.get(original[i]);
        }
        return rows;
    }

    public static void main(String[] args) {
        ArrayUtils.print(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}));
    }
}
