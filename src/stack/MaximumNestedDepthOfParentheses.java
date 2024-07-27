package stack;

import java.util.Stack;

public class MaximumNestedDepthOfParentheses {

    public static int withoutUsingStack(String s) {
        int depth = 0;
        int max = 0;
        for(char a : s.toCharArray()) {
            if(a == '(')
                depth++;
            if(a == ')')
                depth--;
            max = Math.max(max, depth);
        }
        return max;
    }
    public static int maxDepth(String s) {
//        String input = "(1+(2*3)+((8)/4))+1";
//        String result = input.replaceAll("[0-9]+|[-+*/]", "");
        Stack<Character> stack = new Stack<>();
        int max = 0; //(()(()))
        for(char a : s.toCharArray()) {
            if(a == '('){
                stack.push(a);
                max = Math.max(max, stack.size());
            }else if(a == ')'){
                stack.pop();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(withoutUsingStack("(1)+((2))+(((3)))"));
    }
}

