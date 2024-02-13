package hard.array;

import java.util.*;

public class MedianOfTwoSortedArray {
    public static double findMedianSortedArray(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums1)
            list.add(num);
        for(int num: nums2)
            list.add(num);
        Collections.sort(list);
        if(list.size() % 2 == 0){
            System.out.println(list);
            System.out.println(list.get((list.size()/2)-1));
            System.out.println((double)(list.get(list.size()/2) + list.get((list.size()/2)-1))/2);
             return list.get(list.size()/2) + list.get((list.size()/2)-1)/2;
        }else {
            return list.get(list.size()/2);
        }
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArray(new int[]{2,3}, new int[]{1,4}));;
    }
}
