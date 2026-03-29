package array;

public class PlusOne {
    public static int[] recursive(int[] digits, int index) {
        if (index < 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        if (digits[index] < 9) {
            digits[index]++;
            return digits;
        }
        digits[index] = 0;
       return recursive(digits, index - 1);
    }
    public static int[] plusOne(int[] digits) {
        return recursive(digits, digits.length-1);
    }

    public static void main(String[] args) {
        int arr[] = plusOne(new int[]{1,9,9});
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
