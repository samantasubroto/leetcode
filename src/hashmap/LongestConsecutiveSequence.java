package hashmap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i : arr) {
            set.add(i);
        }
        int max = 0;
        for(int i=0;i<arr.length;i++) {
            int prev_num = arr[i] - 1;
            int next_num = arr[i] + 1;
            int temp = 1;
            while(set.remove(prev_num--)){
                temp++;
            }
            while(set.remove(next_num++)){
                temp++;
            }
            max = Math.max(max, temp);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
}
