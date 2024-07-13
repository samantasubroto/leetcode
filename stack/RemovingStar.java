package stack;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemovingStar {
    public static String operation(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()) {
            if(c == '*') {
                stack.pop();
            } else
                stack.push(c);
        }
        return stack.stream().map(String::valueOf).collect(Collectors.joining());
    }
    public static void main(String[] args) {
        System.out.println(operation("erase*****"));
    }
}
