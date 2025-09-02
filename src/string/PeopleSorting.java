package string;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeopleSorting {

    public static String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<names.length;i++) {
            map.put(heights[i], names[i]);
        }

        return map.values().toArray(new String[0]);
    }

    public static void main(String[] args) {
        for(String c : sortPeople(new String[]{"Mary","John","Emma"}, new int[]{180,165,170})) {
            System.out.println(c);
        }
    }
}
