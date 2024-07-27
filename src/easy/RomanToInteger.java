package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int approch(Map<String, Integer> map, String roman) {
        int total = 0;
        int start=0,i=0;
        while(start < roman.length()) {
            if(map.containsKey(roman.substring(start, roman.length()-i))) {
                total += map.get(roman.substring(start, roman.length()-i));
                start = roman.length()-i;
                i = 0;
            } else {
                i++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD",400);
        map.put("CM", 900);
        System.out.println(approch(map, "MCMXCIV"));
    }
}
