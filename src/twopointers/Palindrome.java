package twopointers;

public class Palindrome {

    public static boolean isPalindromic(String str) {
        for(int i=0,j=str.length()-1;i<j;i++,j--) {
            if(str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }

    public static String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++) {
            if(isPalindromic(words[i])) {
                return words[i];
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
    }
}
