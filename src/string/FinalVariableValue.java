package string;

public class FinalVariableValue {

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        x = x++;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
    }
}
