package utils;

import java.util.Arrays;
import java.util.List;

public class ArrayUtils {

    // Copy array
    public static int[] copy(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    // Print array
    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    // Reverse array
    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    // Sum of array
    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) total += num;
        return total;
    }

    public static List<Integer> arrayToList(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .toList();
    }

    public static int[] listToArray(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
