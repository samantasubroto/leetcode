package queue;

import java.util.LinkedList;
import java.util.Queue;

public class BuyingTickets {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int counter = 0;
        for (int num : tickets) {
            queue.add(num);
        }
        while(true) {
            counter++;
            int temp = queue.poll();
            temp = temp - 1;
            if(temp > 0) {
                queue.add(temp);
            }
            if(temp == 0 && k == 0) {
                return counter;
            }
            k--;
            if(k < 0)
                k = queue.size() - 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,2};
        System.out.println(timeRequiredToBuy(arr, 2));;
    }
}
