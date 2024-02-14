import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String name = "subrotho";
        char[] arr = name.toCharArray();
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        char previous_value = arr[0];
        int count = 1;
        System.out.println(arr);
        for(int i=1;i<arr.length;i++) {
            if(previous_value == arr[i]){
                count += 1;
                max = Math.max(count,max);
            } else {
                max = Math.max(count,max);
                previous_value = arr[i];
                count = 1;
            }
        }
        System.out.println(max);
    }
}