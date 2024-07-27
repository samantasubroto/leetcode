package greedy;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {

    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] counts = new int[queries.length];
        for(int i=0;i<queries.length;i++) {
            int total = 0;
            int count = 0;
            for(int j=0;j<nums.length;j++) {
                if((nums[j] + total) <= queries[i]) {
                    total += nums[j];
                    count++;
                }else
                    break;
            }
            counts[i] = count;
        }
        return counts;
    }
    public static void main(String[] args) {
       int[] counts = answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21});
        for(int i=0;i<counts.length;i++){
            System.out.print(counts[i]+" ");
        }
    }
}
