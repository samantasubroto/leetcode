package hashmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubstringWithConcatination {
    public static void findSubstring(String s, String[] words) {
        String concatinated = "";
      concatinated = Stream.of(words).collect(Collectors.joining());
        System.out.println(concatinated);
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        findSubstring(s,words);
    }
}
