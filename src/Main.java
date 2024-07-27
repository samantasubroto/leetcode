import java.util.ArrayList;

class Main {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0;i<accounts.length;i++) {
            int value = 0;
            for(int j=0;j<accounts[i].length;j++) {
                value += accounts[i][j];
            }
            max = Math.max(max, value);
        }
        return max;
    }
    public static void main(String[] args) {

        String name = "hello";
        int count = 0;
        for(int i=0;i<name.length()-1;i++) {
            count += Math.abs((int)name.charAt(i) - (int)name.charAt(i+1));
        }
        System.out.println(count);

    }
}