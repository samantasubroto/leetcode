package string;

import java.util.ArrayList;
import java.util.List;

public class BinaryString {

    public List<String> generate(int n, String current, ArrayList<String> arr) {
        if(current.length() == n) {
            arr.add(current);
            return arr;
        }
        generate(n, current + "1", arr);
        if(current.isEmpty() || current.charAt(current.length() - 1) != '0') {
            generate(n, current + "0", arr);
        }
        return arr;
    }

//    public List<String> validStrings(int n) {
//
//    }

    public static void main(String[] args) {
        BinaryString s = new BinaryString();

    }
}
