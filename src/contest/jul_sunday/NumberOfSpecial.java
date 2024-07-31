package contest.jul_sunday;

import java.util.HashSet;
import java.util.Set;

public class NumberOfSpecial {

    public static int findDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i != n) {
                    count++;
                }
                if (i != 1 && i != n / i && n / i != n) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int nonSpecialCount(long l, long r) {
        Set<Long> specialNumbers = generateSpecialNumbers(r);
        long count = 0;
        for (long i = l; i <= r; i++) {
            if (!specialNumbers.contains(i)) {
                count++;
            }
        }
        return (int)count;
    }

    private static Set<Long> generateSpecialNumbers(long upperLimit) {
        Set<Long> specialNumbers = new HashSet<>();
        long limit = (long) Math.sqrt(upperLimit);
        boolean[] isPrime = new boolean[(int) (limit + 1)];
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                long square = (long) i * i;
                if (square <= upperLimit) {
                    specialNumbers.add(square);
                }
            }
        }
        return specialNumbers;
    }

    public static void main(String[] args) {
        System.out.println(nonSpecialCount(3602634, 440140577));
    }
}
