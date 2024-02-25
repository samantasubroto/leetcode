package greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {

    public static List<Integer> partitionLabels(String s) {
       if(s.length() == 0)
           return new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i), i);
        }
        int prev = -1, max = 0;
        for(int i=0;i<s.length();i++) {
            max = Math.max(max, map.get(s.charAt(i)));
            if(i == max){
                list.add(max - prev);
                prev = max;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
    }
}
