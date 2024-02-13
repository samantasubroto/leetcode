package medium.slidingwindow;

import java.util.Arrays;

public class MinimumSizeSubarray {

    public static int minSubArrayLen(int target, int[] nums) {
        Arrays.sort(nums); //(n log(n))
        Arrays.stream(nums).forEach(System.out::println);
        int min = 0;
        int count = 0;
        for(int i=nums.length-1;i>=0;i--){ //n
            min += nums[i];
            count++;
            if(min >= target)
                return count;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(213, new int[]{12,28,83,4,25,26,25,2,25,25,25,12}));
    }
}
