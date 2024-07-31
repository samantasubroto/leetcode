package twopointers;

import java.util.Arrays;
import java.util.List;

public class CountPairs {

    public static int countPairs(List<Integer> nums, int target) {
        int count = 0;
        if(nums.size() > 1) {
            for (int i = 0; i < nums.size() - 1; i++) {
                for (int j = i+1; j < nums.size(); j++) {
                    if ((nums.get(i) + nums.get(j)) < target)
                        count++;
                }
            }
        }else {
            return 0;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPairs(Arrays.asList(-1,1), 2));
    }
}
