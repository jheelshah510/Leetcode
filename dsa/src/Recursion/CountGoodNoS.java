package Recursion;

import java.util.Scanner;

public class CountGoodNoS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(countGoodNumbers(x));
    }
    static long mod = 10000007;
    private static long countGoodNumbers(int x){
       if(x == 0){
           return 1;
       }
       if(x % 2 != 0){
           return (5 * countGoodNumbers(x -1))%mod;
       }
       else return (4 * countGoodNumbers(x-1))%mod;
       
    }
}
