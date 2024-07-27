package easy;

public class RemoveDuplicatesFromStortedArray {

    public static int remove(int[] arr) {
        int count = 0;
        int lastStored = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != lastStored) {
                lastStored = arr[i];
            } else {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        remove(new int[]{1, 2, 2, 3, 3, 3});
    }
}