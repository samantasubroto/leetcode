package greedy;

import java.util.Arrays;

public class MaximumNumberOfCoin {

    public static int maxCoins(int[] piles) {
       int max_mine = 0;
       Arrays.sort(piles);
//       for (int i=0;i<piles.length;i++)
//           System.out.print(piles[i]+" ");
//        System.out.println();
       for(int i=0,j=piles.length-1;i<j;i++,j--){
           j--;
           max_mine += piles[j];
          // System.out.print(piles[j]+" ");
       }
       return max_mine;
    }

    public static void main(String[] args) {
        System.out.println(maxCoins(new int[]{9,8,7,6,5,1,2,3,4}));;
    }
}
