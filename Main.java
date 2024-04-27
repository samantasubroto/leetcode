import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] arr = {"abc", "edf"};

        String inClause = Arrays.stream(arr)
                .collect(Collectors.joining("', '", "('", "')"));

        System.out.println(inClause);

//        Set<Integer> old = new HashSet<>();
//        Set<Integer> newA = new HashSet<>();
//        old.add(1);
//        old.add(2);
//        old.add(3);
//        newA.add(3);
//        newA.add(4);
//        newA.add(5);
//
//        // Create two sets to hold the elements present in one set but not in the other
//        Set<Integer> onlyInOld = new HashSet<>(old);
//        Set<Integer> onlyInNewA = new HashSet<>(newA);
//
//        // Retain common elements between old and newA, and remove them from onlyInOld and onlyInNewA sets
//        onlyInOld.removeAll(newA);
//        onlyInNewA.removeAll(old);
//
//        System.out.println("Elements only in old: " + onlyInOld); // Output: Elements only in old: [1, 2]
//        System.out.println("Elements only in newA: " + onlyInNewA); // Output: Elements only in newA: [4, 5]
    }
}