package queue;

public class UniqueCharInString {
    public static int firstUniqChar(String s) {
       int arr[] = new int[26];
       for(char c : s.toCharArray()) {
           int k = c - 'a';
           arr[k]++;
       }
       for(int i=0;i<s.length();i++) {
           if(arr[s.charAt(i) - 'a'] == 1)
               return i;
       }
       return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
