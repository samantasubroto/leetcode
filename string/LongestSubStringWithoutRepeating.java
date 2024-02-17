package string;

import java.util.*;

public class LongestSubStringWithoutRepeating {

    public static int usingHashMap(String s) {
        if(s.length() == 0)
            return 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0,j=0;i<s.length();++i) {
           if(map.containsKey(s.charAt(i))) {
               j = Math.max(j, map.get(s.charAt(i))+1);
           }
           map.put(s.charAt(i), i);
           max = Math.max(max, i-j+1);
        }
        return max;
    }

    public static boolean doesContainDuplicates(String s) {
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()) {
            if(set.contains(c))
                return false;
            else set.add(c);
        };
        return true;
    }
    public static int lengthOfLongestSubstring(String s) {
        int size = 1;
        for(int i = 0;i<s.length()-1;i++) {
            for(int j=s.length();j>i && j-i > size;j--) {
              if(doesContainDuplicates(s.substring(i,j))){
                  size = s.substring(i,j).length();
              }
            }
        }
        return size;
    }

    public static int usingQueueBestApproch(String s) {
        if(s.length() == 0)
            return 0;
        Queue<Character> queue = new LinkedList<>();
        int size = 0;
        for(char c : s.toCharArray()) {
            while(queue.contains(c))
                queue.poll();
            queue.offer(c);
            size = Math.max(size,queue.size());
        }
        return size;
    }

    public static void main(String[] args) {
        System.out.println(usingQueueBestApproch("pwwkew"));
    }
}
