package binarysearch;

import java.util.*;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {

    public static boolean contains(int[] arr, int key) {
        if(arr.length == 0)
            return false;
        if(arr.length == 1 && arr[0] == key)
            return true;
        int low = 0;
        int high = arr.length-1;
        while(low < high) {
            int mid = low+(high-1)/2;
            if(arr[mid] == key)
                return true;
            if(arr[mid] < key) {
                low = mid + 1;
            }else
                high = mid -1;
        }
        return false;
    }
    public static int[] usingBF(int[] arr1, int[] arr2) {
        Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> list = new HashSet<>();
        for(int a : arr2)
            if(set1.contains(a)){
                list.add(a);
            }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(usingBF(new int[]{1,2,3}, new int[]{1,2}));;
        // System.out.println(contains(new int[]{1}, 1));
    }
}
