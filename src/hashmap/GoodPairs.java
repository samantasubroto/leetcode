package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class GoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> feq_map = new HashMap<>();
        Arrays.stream(nums).forEach((element) -> {
            feq_map.put(element, feq_map.getOrDefault(element, 0) + 1);
        });
        int counter = 0;
        for(int ele : feq_map.keySet()){
            int value = feq_map.get(ele);
            if(value > 1) {
                counter += ((value * (value - 1)) / 2);
            }
        };
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(numIdenticalPairs(new int[]{1,2,3,1,1,3}));
    }
}
