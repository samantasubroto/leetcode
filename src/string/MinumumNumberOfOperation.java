package string;

import java.util.ArrayList;
import java.util.List;

public class MinumumNumberOfOperation {

    public static int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] result = new int[n];

        // Left to right pass
        int leftCount = 0, leftCost = 0;
        for (int i = 0; i < n; i++) {
            result[i] = leftCost;
            if (boxes.charAt(i) == '1') {
                leftCount++;
            }
            leftCost += leftCount;
        }

        // Right to left pass
        int rightCount = 0, rightCost = 0;
        for (int i = n - 1; i >= 0; i--) {
            result[i] += rightCost;
            if (boxes.charAt(i) == '1') {
                rightCount++;
            }
            rightCost += rightCount;
        }

        return result;
    }


    public static void main(String[] args) {
        minOperations("001011");
    }
}
