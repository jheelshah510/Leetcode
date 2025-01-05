package Recursion;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        System.out.println(digitSum(s));
    }

    private static int digitSum(int num){
        if(num == 0){
            return 0;
        }
        return num%10 + digitSum(num/10);
    }
}
