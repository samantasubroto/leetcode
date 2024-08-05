package twopointers;

public class MergeString {

    public static String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0, k = 0;
        StringBuilder sb = new StringBuilder();
        while (i < word1.length() && j < word2.length() - 1) {
            sb.insert(k++, word1.charAt(i++));
            sb.insert(k++, word2.charAt(j++));
        }
        while (i < word1.length()) {
            sb.insert(k++, word1.charAt(i++));
        }
        while (j < word1.length()) {
            sb.insert(k++, word2.charAt(j++));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
    }
}
