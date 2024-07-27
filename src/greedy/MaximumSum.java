package greedy;

public class MaximumSum {

    public static int maximizeSum(int[] nums, int k) {
        int total = 0;
        int largest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }
        while(k != 0) {
            total += largest;
            largest++;
            k--;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(maximizeSum(arr, 3));
    }
}
