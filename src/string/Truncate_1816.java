package string;

import java.util.Arrays;

public class Truncate_1816 {
    public static String truncateSentence(String s, int k) {
        return String.join(" ", Arrays.copyOf(s.strip().split(" "), k));
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence( "Hello how are you Contestant ", 4));
    }
}
