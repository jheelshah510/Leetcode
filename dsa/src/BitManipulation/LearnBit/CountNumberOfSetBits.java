package BitManipulation.LearnBit;

import java.util.Scanner;

public class CountNumberOfSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;

        while (num >1){
            if((num & 1) == 1) count++;

            num = num >> 1;

        }
        if(num == 1) count++;
        System.out.println(count);
    }
}
