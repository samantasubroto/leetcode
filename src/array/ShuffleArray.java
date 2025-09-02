package array;

public class ShuffleArray {

    public static int[] shuffle(int[] nums, int n) {
        int mid = n/2;
        int[] arr = new int[n];
        int z = 0;
        for(int i=0,j=mid;i<mid&&j<n;i++,j++) {
            arr[z++] = nums[i];
            arr[z++] = nums[j];
        }
        return arr;
    }

    public static void main(String[] args) {
        for(int i : shuffle(new int[]{2,5,1,3,4,7}, 6)) {
            System.out.println(i);
        }

    }
}
