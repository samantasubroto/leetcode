package string;

import java.util.HashMap;
import java.util.Map;

public class encoder {

    private static final String BASE_URL = "http://short.ly/";
    private int id = 1;
    private Map<String, String> codeToUrl = new HashMap<>();
    private Map<String, String> urlToCode = new HashMap<>();
    String value = "";

    public String encode(String longUrl) {
        if (urlToCode.containsKey(longUrl)) {
            return BASE_URL + urlToCode.get(longUrl);
        }

        String shortCode = String.valueOf(id++);
        codeToUrl.put(shortCode, longUrl);
        urlToCode.put(longUrl, shortCode);

        return BASE_URL + shortCode;
    }

    public String decode(String shortUrl) {
        String code = shortUrl.replace(BASE_URL, "");
        return codeToUrl.getOrDefault(code, "Not found");
    }

    public static void main(String[] args) {
        encoder en = new encoder();
        System.out.println(en.encode("https://leetcode.com/problems/encode-and-decode-tinyurl/description/?envType=problem-list-v2&envId=string"));
        System.out.println(en.decode("http://short.ly/1"));
    }
}
