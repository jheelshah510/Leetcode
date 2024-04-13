package Recursion;

import java.util.Scanner;

public class LearnParmeterized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int summation = sumOfFirstN(sc.nextInt(),0);

        System.out.println(summation);
    }

    private static int sumOfFirstN(int num,int sum){

        if(num == 0){
            return 0;
        }

        return sumOfFirstN(num-1,sum);
    }
}
