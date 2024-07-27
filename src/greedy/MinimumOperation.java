package greedy;

public class MinimumOperation {
    public static int minOperations(int[] nums) {
      if(nums.length > 1) {
          int count = 0;
          int pastValue = nums[0];
          for(int i=1;i<nums.length;i++) {
              if(nums[i] <= pastValue) {
                  int value = (pastValue - nums[i]) + 1;;
                  count += value;
                  pastValue = value + nums[i];
              } else {
                  pastValue = nums[i];
              }
          }
          return count;
      }
      return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1};
        System.out.println(minOperations(arr));
    }
}
