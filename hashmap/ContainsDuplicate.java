package hashmap;

import java.util.*;

public class ContainsDuplicate {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if(entry.getValue().size() >= 2) {
                for(int j=0;j<entry.getValue().size()-1;j++) {
                    if(Math.abs(entry.getValue().get(j) - entry.getValue().get(j+1)) <= k)
                        return true;
                }
            }

        }
        return false;
    }

    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                window.remove(nums[i - k - 1]);
            }
            if (window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        System.out.println(containsNearbyDuplicate2(new int[]{1,2,3,4,1,2}, 3));
    }
}
