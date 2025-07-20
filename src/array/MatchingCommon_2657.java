package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MatchingCommon_2657 {

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        Map<Integer, Integer> map;
        int[] result = new int[A.length];

        for (int i=0;i<A.length;i++) {
            map = new HashMap<>();
            for (int j=0;j<=i;j++) {
                map.put(A[j], map.getOrDefault(A[j], 0)+1);
                map.put(B[j], map.getOrDefault(B[j], 0)+1);
            }
            System.out.println(map);
            int count = (int) map.values().stream().filter(val -> val >= 2).count();
            result[i] += count;
        }
        return result;
    }

    public static void main(String[] args) {
        for(int i : findThePrefixCommonArray(new int[]{1,3,2,4}, new int[]{3,1,2,4})) {
            System.out.print(i + " ");
        }
    }
}
