package array;

import utils.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLength_1313 {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int size = nums.length % 2 == 0 ? nums.length : nums.length - 1;
        for(int i=0;i<size-1;i=i+2) {
            for(int j=0;j<nums[i];j++) {
                list.add(nums[i+1]);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        decompressRLElist(new int[]{1,2,3,4});
    }
}
