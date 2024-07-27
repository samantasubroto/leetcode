package greedy;

public class MaximumOddBinaryNumber {
    public static String maximumOddBinaryNumber(String s) {
        int count = 0;
        for(char c : s.toCharArray()) {
            if (c == '1')
                count++;
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length()-1;i++){
            if(count != 1){
                sb.append("1");
                count--;
            }else {
                sb.append("0");
            }
        }
        sb.append("1");
        return sb.toString();
    }

    public static void main(String[] args) {
       maximumOddBinaryNumber("11001111");
    }
}
