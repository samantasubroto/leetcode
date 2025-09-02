package string;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShuffleString {

    public static String restoreString(String s, int[] indices) {
        Map<Integer, Character> map = new TreeMap<>();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++) {
            map.put(indices[i], s.charAt(i));
        }
        for(char c : map.values()) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3});
    }
}
