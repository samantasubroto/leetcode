import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    static void printArray(int[] arr){
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void removeElement(int[] arr, int val) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_idx] == val) {
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        for(int i=arr.length-1;i>=0 && arr[i]==val;i--) {
            count++;
        }
        System.out.println(n - count);
        printArray(arr);
    }
    public static void main(String[] args) {
        removeElement(new int[]{2,2,3,3}, 3);
    }
}