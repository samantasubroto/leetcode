package easy;

import java.util.LinkedList;
import java.util.List;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        int temp = x;
        int reverse = temp % 10;
        temp = temp / 10;
        while(temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        System.out.println(reverse);
        return reverse == x;
    }

    public static boolean usingArray(int number) {
        String s = String.valueOf(number);
        char[] array = s.toCharArray();
        for(int i=0,j=array.length-1;i!=j && i<j;i++,j--) {
            if(array[i] != array[j])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(usingArray(11));
    }
}
