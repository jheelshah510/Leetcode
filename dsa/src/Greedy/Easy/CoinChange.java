package Greedy.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int[] coins = new int[sc.nextInt()];

        for(int i = 0; i< coins.length; i++){
            coins[i] =sc.nextInt();
        }

        System.out.println(minCoins(coins,sum));
    }

    private static int minCoins(int coins[],int sum){
        Arrays.sort(coins);
        int n = coins.length;
        int tempSum = 0;
        int ans = 0;
        for(int i = n-1;i>=0;i--){
            while(tempSum + coins[i] <= sum){
                tempSum+=coins[i];
                ans++;
            }
            if(tempSum > sum){
                tempSum-=coins[i];
                ans--;
            }
            if(tempSum == sum){
                return ans;
            }
        }
        return -1;
    }
}
