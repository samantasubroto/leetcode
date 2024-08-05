package twopointers;

public class LexicographicallySmallPalindrome {

    public static char laxiSmall(char c1, char c2) {
        if ((int) c1 < (int) c2)
            return c1;
        else return c2;
    }

    public static String isPalindrome(String str) {
        int counter = 0;
        StringBuilder sb = new StringBuilder(str);
        for(int i=0,j=str.length()-1;i<j;i++,j--) {
            if(str.charAt(i) != str.charAt(j)) {
                counter++;
                if((int)str.charAt(i) < (int)str.charAt(j)) {
                    sb.replace(j,j+1, String.valueOf(str.charAt(i)));
                } else {
                    sb.replace(i, i+1, String.valueOf(str.charAt(j)));
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("egcfe"));
    }
}
