package hashmap;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int findMajorityRepeated(int[] arr) {
        if(arr.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int element: arr) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for(int key: map.keySet()) {
            int temp = map.get(key);
            if(temp > arr.length/2)
                max = key;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMajorityRepeated(new int[]{3,3,4}));
    }
}
