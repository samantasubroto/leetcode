package twopointers;

import java.util.Stack;

public class ReverseWords {

    public static String main(String[] args) {
        String str = "Let's take LeetCode contest";
        String[] splited = str.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=0;i<splited.length;i++) {
            StringBuilder sb = new StringBuilder(splited[i]);
            res.append(sb.reverse());
        }
        return res.toString().substring(0, res.length()-1);

    }
}
