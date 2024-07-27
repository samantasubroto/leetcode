package greedy;

import java.util.Arrays;

public class MinimizeMaximumPair {

    public static int minPairSum(int[] nums) {
      Arrays.sort(nums);
      int max_value = 0;
      for(int i=0,j=nums.length-1;i<j;i++,j--) {
          max_value = Math.max(max_value, nums[i]+nums[j]);
      }
      return max_value;
    }

    public static void main(String[] args) {
        System.out.println(minPairSum(new int[]{3,5,4,2,4,6}));
    }
}
