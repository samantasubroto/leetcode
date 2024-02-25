import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String input = "(1+(2*3)+((8)/4))+1";

        // Remove numbers and operators
        String result = input.replaceAll("[0-9]+|[-+*/]", "");

        System.out.println("Result: " + result);
    }
}