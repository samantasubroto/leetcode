package twopointers;

public class EvenOneSide {
    public static int[] sortArrayByParity(int[] nums) {
        for(int i=0,j=nums.length-1;i<j;) {
            int iItem = nums[i] % 2;
            int jItem = nums[j] % 2;
            if(iItem == 0 && jItem == 0) {
              i++;
            }else if(iItem != 0 && jItem != 0) {
                j--;
            }else if(iItem != 0 && jItem == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            } else {
                i++;
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
       int[] nums = sortArrayByParity(new int[]{0,1});
       for(int i=0;i<nums.length;i++) {
           System.out.print(nums[i]+ " ");
       }
    }
}
