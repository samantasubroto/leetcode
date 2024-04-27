package stack;

import java.util.ArrayList;
import java.util.List;

public class BuildArrayWithStackOperations {

    public static List<String> buildArray(int[] target, int n) {
       int j = 0;
       List<String> list = new ArrayList<>();
       for(int i=1;i<=n && target.length > j;i++) {
           if(i == target[j]){
               list.add("Push");
               j++;
           }else {
               list.add("Push");
               list.add("Pop");
           }
       }
       return list;
    }

    public static void main(String[] args) {
        System.out.println(buildArray(new int[]{2,3,4}, 4));
    }
}
