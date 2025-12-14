package hashmap;

import java.util.HashMap;
import java.util.Map;

public class DecodeMessage {
    public static void decodeMessage(String key, String message) {
        String actualKey = key.replaceAll(" ", "");
        int alpha = 97;
        StringBuilder sb = new StringBuilder();
        Map<Character, Character> map = new HashMap<>();
        for (char ch : actualKey.toCharArray()) {
            if(!map.containsKey(ch)) {
                map.put(ch, (char)alpha);
                alpha++;
            }
        }
        for(char ch : message.toCharArray()) {
            if(map.containsKey(ch)) {
                sb.append(map.get(ch));
            }else {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
    }
}
