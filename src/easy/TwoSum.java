package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twosum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i], i);
        }
        for(int i=0;i<arr.length;i++) {
            int c = target - arr[i];
            if(map.containsKey(c) && map.get(c) != i) {
               return new int[]{i, map.get(c)};
            }
        }
        return new int[]{};
    }

    public static int[] bruteforce(int[] arr, int target) {
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = twosum(new int[]{2,7,11,15}, 9);
        System.out.println(arr[0]+ " "+ arr[1]);
    }
}
