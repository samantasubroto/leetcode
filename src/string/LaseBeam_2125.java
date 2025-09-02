package string;

import java.math.BigDecimal;

public class LaseBeam_2125 {
    public static int numberOfBeams(String[] bank) {
        int[] devicesPerRow = new int[bank.length];
        for (int i = 0; i < bank.length; i++) {
            int count = 0;
            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') count++;
            }
            devicesPerRow[i] = count;
        }

        int total = 0, prev = 0;
        for (int d : devicesPerRow) {
            if (d > 0) {
                total += prev * d;
                prev = d;
            }
        }
        return total;
    }

    public <T extends BigDecimal> void printDouble(T num) {
        System.out.println(num.multiply(new BigDecimal(123)));;
    }


    public static void main(String[] args) {

    }
}
