import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        String name = "hello";
        int count = 0;
        for(int i=0;i<name.length()-1;i++) {
            count += Math.abs((int)name.charAt(i) - (int)name.charAt(i+1));
        }
        System.out.println(count);

    }
}