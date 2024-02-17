package string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestCommonPrefix {

    /**
    Reason for Sorting
    The reason why we sort the input array of strings and compare the first and last strings is
     that the longest common prefix of all the strings must be a prefix of the first string and a
     prefix of the last string in the sorted array. This is because strings are ordered based on their
     alphabetical order (Lexicographical order).

     For example, consider the input array of strings {"flower", "flow", "flight"}.
     After sorting the array, we get {"flight", "flow", "flower"}.
     The longest common prefix of all the strings is "fl",
     which is located at the beginning of the first string "flight" and the second string "flow".
     Therefore, by comparing the first and last strings of the sorted array, we can easily find the longest common prefix.
   **/

    public static String longestCommonPrefix(String[] str) {
       // String shortestStr = List.of(str).stream().min(Comparator.comparing(String::length)).get();
        String shortestStr = str[0];
        String previousMatch = "";
        boolean isFound = true;
        int itr = 1;
        while(isFound && itr <= shortestStr.length()) {
            isFound = false;
            for(int i=0;i<str.length;i++) {
                if(!shortestStr.substring(0,itr).matches(str[i].substring(0,itr)))
                    return previousMatch;
            }
            previousMatch = shortestStr.substring(0,itr);
            itr++;
            isFound = true;
        }
        return previousMatch;
    }

    public static String withSorting(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }

    public static void main(String[] args) {
        withSorting(new String[]{"deewan","agni","flower","flow","flight"});

        //System.out.println(withSorting(new String[]{"flower","flow","flight"}));;
    }
}
