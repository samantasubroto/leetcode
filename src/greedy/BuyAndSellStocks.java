package greedy;

public class BuyAndSellStocks {

    public static int bruteForce(int[] arr) {
        int profit = 0;
        int buyingPrice = arr[0];
        int diff = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
              diff = Math.max(diff, arr[i]-buyingPrice);
            }else {
                buyingPrice = arr[i];
                profit+= diff;
                diff = 0;
            }
        }
        return profit+diff;
    }

    public static int greedy(int[] prices) {
        int profit = 0;
        int initial = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > initial){
                profit += prices[i] - initial;
            }
            initial = prices[i];
        }
        return profit;
    }
  //[7,1,5,3,6,4]
    public static void main(String[] args){
        System.out.println(greedy(new int[]{2,1,4}));
    }
}
