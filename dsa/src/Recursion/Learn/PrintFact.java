package Recursion.Learn;

import java.util.Scanner;

public class PrintFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    private static int fact(int n){
        if(n == 0) return 1;
        return n * fact(n-1);
    }
}
