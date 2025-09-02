package string;

public class PartitioningIntoMinimumNumber {
    // single number can never be greater then 9
    // so we can take advantage of this right
    public static int minPartitions(String n) {
        int max = 0;
        if(n.length() == 1) return n.charAt(0) - '0';
        for (int i=0,j=n.length()-1;i<n.length() && j>0;i++,j--) {
            int digit = n.charAt(i) - '0';
            int last_digit = n.charAt(j) - '0';
            if (digit > max) max = digit;
            if (last_digit > max) max = last_digit;
            if (max == 9) break;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(minPartitions("2"));;
    }
}
