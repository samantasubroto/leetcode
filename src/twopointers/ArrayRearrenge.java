package twopointers;

import java.util.ArrayList;
import java.util.List;

public class ArrayRearrenge {

    public static int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negetive = new ArrayList<>();
        for(int i = 0 ;i<nums.length;i++) {
            if(nums[i] < 0) {
                negetive.add(nums[i]);
            }else {
                positive.add(nums[i]);
            }
        }
        int[] arr = new int[nums.length];
        int j = 0;
        int index = 0;
        for(int i=0;i<(nums.length)/2;i++) {
            arr[index] = positive.get(j);
            index++;
            arr[index] = negetive.get(j);
            j = j+1;
            index++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] ints = rearrangeArray(new int[]{3, 1, -2, -5, 2, -4});
        for(int i=0;i<ints.length;i++) {
            System.out.print(ints[i]+" ");
        }
    }
}
