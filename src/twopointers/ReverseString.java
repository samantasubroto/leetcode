package twopointers;

public class ReverseString {
    public static void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0,j=s.length-1;i<j;i++,j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        sb.append("[");
        for(int i=0;i<s.length;i++) {
            sb.append("\"" + s[i] + "\",");
        }
        sb.setLength(sb.length() - 1);
        sb.append("]");
        System.out.println(sb);
    }

    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
    }
}
