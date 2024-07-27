package bitmanipulation;

public class General {

    public static String convert2Binary(int n) {
        StringBuilder res = new StringBuilder();
        while(n != 0) {
            if(n % 2 == 1)
               res.append("1");
            else
                res.append("0");
            n = n/2;
        }
        res.reverse();
        return res.toString();
    }

    public static int convertBinary2Decimal() {

    }

    public static void main(String[] args) {
        System.out.println(convert2Binary(13));
    }
}
