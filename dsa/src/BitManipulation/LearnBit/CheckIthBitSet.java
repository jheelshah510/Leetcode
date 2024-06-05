package BitManipulation.LearnBit;

import java.util.Scanner;

public class CheckIthBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        System.out.println("Bit to find the set");
        int i = sc.nextInt();

        i = 1 << i;

        nums = nums & i;

        if(nums > 0) System.out.println(1);

        else System.out.println(0);
        
    }
}
