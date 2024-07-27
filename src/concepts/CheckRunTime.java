package concepts;

public class CheckRunTime {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        //your code


        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
    }
}
