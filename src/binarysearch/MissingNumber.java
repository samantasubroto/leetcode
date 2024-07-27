package binarysearch;

import java.util.Arrays;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        long total_value = 0, expected_value = (nums.length * (nums.length + 1))/2;
       for(int i : nums) {
           total_value += i;
       }
       return (int) (expected_value - total_value);
    }

    public static void main(String[] args) {

    }
}
