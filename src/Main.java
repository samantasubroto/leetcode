import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1] * nums[nums.length-2]) - (nums[0] * nums[1]);
    }
    public static void main(String[] args) {

    }
}