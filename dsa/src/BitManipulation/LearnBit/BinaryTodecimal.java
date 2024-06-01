package BitManipulation.LearnBit;

import java.util.Scanner;

public class BinaryTodecimal {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        String str = sc.next();

        System.out.println(binToDec(str));
    }
    public static int binToDec(String str){

        int ans = 0;
        int count = 0;

        for(int i = str.length()-1;i>=0;i--){
            if (str.charAt(i) == '1') {
                ans += (int) Math.pow(2, count);
            }
            count++;
        }
        return ans;
    }
}
