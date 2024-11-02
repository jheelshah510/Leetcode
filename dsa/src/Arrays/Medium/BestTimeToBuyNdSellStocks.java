package Arrays.Medium;

import java.util.Scanner;

public class BestTimeToBuyNdSellStocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProfit(arr));
    }
    private static int maxProfit(int[] prices){
        int n = prices.length;

        int maxP = 0;
        int minEl = prices[0];

        for(int i = 1;i<n;i++){
            if(prices[i] > minEl){
                maxP = Math.max(maxP,prices[i] - minEl);

            }
            else {
                minEl = prices[i];
            }
        }
        return maxP;
    }
}
