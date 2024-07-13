package queue;

import java.util.ArrayList;
import java.util.List;

public class NestedIterator {

    public static boolean isInteger(Object s) {
        try {
            if (s == (Integer) s) {
            }
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 0; i < list.size(); i++) {
            if (isInteger(list)) {
                System.out.println("Yes this is an Integer");
            } else {
                System.out.println("This is not an Integer");
            }
        }
    }

}
