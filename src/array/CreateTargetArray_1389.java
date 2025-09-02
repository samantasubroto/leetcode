package array;

import utils.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray_1389 {

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<index.length;i++) {
            list.add(index[i], nums[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        ArrayUtils.print(createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1}));
    }
}
