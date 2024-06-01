package BitManipulation.LearnBit;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("Binary value is"+decToBin(num));
    }
    public static String decToBin(int num){
        String ans = "";
        while(num != 0){
            ans += num%2;
            num = num/2;
        }
        return rev(ans);
    }
    public static String rev(String str){

        String temp = "";

        for(int i = str.length()-1;i>=0;i--){
            temp += str.charAt(i);
        }
        return temp;
    }
}
