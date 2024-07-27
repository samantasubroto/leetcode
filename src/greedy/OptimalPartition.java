package greedy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class OptimalPartition {
    public static int partitionString(String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        int i = 0;
        while (i < s.length()) {
            if(set.contains(s.charAt(i))){
                count++;
                set.clear();
            }
            set.add(s.charAt(i));
            i++;
        }
        return count++;
    }

    public static void main(String[] args) {
        partitionString("abacaba");

    }
}
