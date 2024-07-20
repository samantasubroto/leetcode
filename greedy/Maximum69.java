package greedy;

import java.util.Arrays;

public class Maximum69 {
    public static int maximum69Number (int num) {
       String strnum = String.valueOf(num);
       StringBuffer sb = new StringBuffer(strnum);
       for(int i=0;i<sb.length();i++) {
           if(sb.charAt(i) == '6') {
               sb.setCharAt(i, '9');
               break;
           }
       }
        return Integer.parseInt(sb.toString());
    }
    public static void main(String[] args) {
        int num = 9669;
        System.out.println(maximum69Number(num));

    }
}
