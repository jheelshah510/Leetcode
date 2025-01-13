package Recursion.Learn;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        int n = sc.nextInt();

        System.out.println(myPow(x, n));
    }

    private static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / (x * myPow(x, -n - 1));
        } else if (n % 2 == 0) {
            return  myPow(x*x, n / 2);
        }
        return x * myPow(x, n - 1);
    }

}
