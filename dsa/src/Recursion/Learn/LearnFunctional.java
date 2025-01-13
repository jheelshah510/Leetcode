package Recursion.Learn;

import java.util.Scanner;



public class LearnFunctional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int summation = sumOfFirstN(sc.nextInt());

        System.out.println(summation);
    }

    private static int sumOfFirstN(int n){

        if(n == 0){
            return 0;
        }
        return n + sumOfFirstN(n-1);
    }
}
