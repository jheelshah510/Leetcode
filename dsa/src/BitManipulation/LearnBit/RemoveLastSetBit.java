package BitManipulation.LearnBit;

import java.util.Scanner;

public class RemoveLastSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();

        int previousNum = nums -1;

        nums = nums & previousNum;

        System.out.println(nums);
    }
}
