package stack;

import java.util.Stack;

public class FinalPriceDiscount {
    public static int[] finalPrices(int[] prices) {
      int[] afterdiscount = new int[prices.length];
      Stack<Integer> stack = new Stack<>();

      for(int i=prices.length-1;i>=0;i--) {
          while(!stack.isEmpty() && stack.peek() > prices[i]) { //pop until we found smaller
              stack.pop();
          }if(stack.isEmpty()){  //we haven't found any smaller
              afterdiscount[i] = prices[i];
          }else {
              afterdiscount[i] = prices[i] - stack.peek();
          }
          stack.push(prices[i]);
      }
      return afterdiscount;
    }

    public static void main(String[] args) {
        int[] arr = finalPrices(new int[]{8,4,6,2,3});
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
