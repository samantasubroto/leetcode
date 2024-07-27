package medium;

import java.util.*;

public class RepeatedDNA {


    public static List<String>  usingHashMap(String s) {
        Set seen = new HashSet(), repeated = new HashSet();
        for(int i=0;i+9<s.length();i++) {
            if(!seen.add(s.substring(i, i+10)))
                repeated.add(s.substring(i, i+10));
        }
        return new ArrayList(repeated);
    }

    public static void main(String[] args) {
        System.out.println(usingHashMap("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }
}
