package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PangramString {
    public static boolean checkIfPangram(String sentence) {
        for(char ch='a';ch<='z';ch++) {
            if(!sentence.contains(String.valueOf(ch)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram("leetcode"));;
    }
}
