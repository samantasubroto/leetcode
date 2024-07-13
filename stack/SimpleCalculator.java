package stack;

import java.util.Stack;

public class SimpleCalculator {

    public static void main(String[] args) {
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operator = new Stack<>();
        String str = " 3+5 / 2 ".trim().replaceAll("\\s+"," ");
        String str1 = "";
        for(char c : str.toCharArray()) {
            if(c != ' '){
                if (c == '+' || c == '-' || c == '*' || c == '/')
                    operator.push(c);
                else
                    numbers.push(Character.getNumericValue(c));
            }
        }
        long result;
        while(operator.isEmpty() || numbers.isEmpty()) {
            int temp = numbers.pop();
             char val = operator.pop();
             int temp2 = numbers.pop();
        }

    }
}
