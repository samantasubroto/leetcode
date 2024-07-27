package stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

//https://leetcode.com/problems/baseball-game/
public class BaseBallGame {

    public static void addLastTwo(List<String> list) {
        if(list.size() >= 2) {
            list.add(String.valueOf(Integer.parseInt(list.get(list.size()-2)) + Integer.parseInt(list.get(list.size()-1))));
        }
    }

    public static void doubleTheLast(List<String> list) {
        if(list.size() >= 1) {
            list.add(String.valueOf(Integer.parseInt(list.get(list.size()-1)) * 2));
        }
    }

    public static void removeLast(List<String> list) {
        if(list.size() >= 1) {
            list.remove(list.get(list.size()-1));
        }
    }
    public static int calPoints(String[] operations) {

        List<String> list = new ArrayList<>();
        Arrays.stream(operations).forEach(element -> {
            switch(element) {
                case "C":
                    removeLast(list);
                    break;
                case "D":
                    doubleTheLast(list);
                    break;
                case "+":
                    addLastTwo(list);
                    break;
                default:
                    list.add(element);
            }
        });
       return list.stream().mapToInt(Integer::parseInt).sum();
    }

    public static int calPointsUsingStack(String[] operations) {

        Stack<String> stack = new Stack<>();
        Arrays.stream(operations).forEach(element -> {
            switch(element) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    int value = Integer.parseInt(stack.pop());
                    int multiplyValue = 2*value;
                    stack.push(String.valueOf(value));
                    stack.push(String.valueOf(multiplyValue));
                    break;
                case "+":
                    int first = Integer.parseInt(stack.pop());
                    int second = Integer.parseInt(stack.pop());
                    int totalValue = first + second;
                    stack.push(String.valueOf(second));
                    stack.push(String.valueOf(first));
                    stack.push(String.valueOf(totalValue));
                    break;
                default:
                    stack.push(element);
            }
        });
        return stack.stream().mapToInt(Integer::parseInt).sum();
    }

    public static void main(String[] args) {
        System.out.println(calPointsUsingStack(new String[]{"-2", "4", "D"}));;
    }
}