package slidingwindow;

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

    public static int usingSlidingWindow(int target, int[] nums) {
        int sum = 0;
        int i=0,j = 0;
        int result = nums.length+1;
        while(j<nums.length) {
            sum += nums[j];
            while(sum >= target) //for sliding window we always use while
            {
                int len = j-i+1;
                result = Math.min(result, len);
                sum-= nums[i]; //removing the first element to check if its still satisfy the condition
                i++;
            }
            j++;
        }
        return (result==nums.length+1) ? 0 : result;
    }


    public static void main(String[] args) {
        System.out.println(usingSlidingWindow(213, new int[]{12,28,83,4,25,26,25,2,25,25,25,12}));
    }
}
