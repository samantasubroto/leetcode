package string;

import java.util.HashSet;
import java.util.Set;

public class AllowedStringMatch {

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char c: allowed.toCharArray()) set.add(c);

        outer: for(String word: words) {
            for(int i = 0;i<word.length();i++) {
                if (!set.contains(word.charAt(i))) continue outer;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countConsistentStrings("abc", new String[]{"abd", "ac"}));
    }
}
