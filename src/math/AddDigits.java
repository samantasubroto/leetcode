package math;

public class AddDigits {

    public static int addDigits(int num) {
        if (num < 10) return num;
        int temp = 0;
        while (num > 0) {
            temp += num % 10;
            num = num / 10;
        }
        return addDigits(temp);
    }

    public static void main(String[] args) {
        System.out.println(addDigits(12345));;
    }
}
