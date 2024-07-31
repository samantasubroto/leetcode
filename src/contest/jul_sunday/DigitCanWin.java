package contest.jul_sunday;

public class DigitCanWin {
    public static boolean canAliceWin(int[] nums) {
       int singleNumber = 0;
       int doubleNumber = 0;
       for(int number: nums) {
           if(number >= -9 && number <= 9) {
               singleNumber += number;
           }else {
               doubleNumber += number;
           }
       }
       return singleNumber != doubleNumber;
    }

    public static void main(String[] args) {
        System.out.println(canAliceWin(new int[]{1,2,3,4,5,14}));
    }
}
