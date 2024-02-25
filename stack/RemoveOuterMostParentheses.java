package stack;

import java.util.Stack;

public class RemoveOuterMostParentheses {
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char a : s.toCharArray()) {
            if(a == '('){
                if(stack.size() > 0){
                    sb.append(a);
                }
                stack.push(a);
            }else {
                stack.pop();
                if(stack.size() > 0) {
                    sb.append(a);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()(()))"));;
    }
}
