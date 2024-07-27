package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumSum {
    public int minimumSum(int num) {
        final List<Integer> nums = new ArrayList<>();
        while(num > 0) {
            nums.add(num%10);
            num = num / 10;
        }
        Collections.sort(nums);
        int num1 = 0, num2 = 0;
        for(int i=0;i<nums.size();i++) {
            if(i % 2 == 0) {
                num1 *= 10;
                num1 += nums.get(i);
            } else {
                num2 *= 10;
                num2 += nums.get(i);
            }
        }
        return num1 + num2;
    }

    public static void main(String[] args) {

    }
}
