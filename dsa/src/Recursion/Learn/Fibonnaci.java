package Recursion.Learn;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(fib(x));
    }

    private static int fib(int x){
        if(x == 1){
            return 0;
        }
       if(x == 2){
           return 1;
       }
       return fib(x-1)+ fib(x-2);
    }

}
