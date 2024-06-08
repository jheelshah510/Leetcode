package BitManipulation.InterviewProb;

import java.util.Scanner;

public class SingleNumOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i = 0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        int xor = 0;

        for (int i = 0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }

        System.out.println(xor);
    }
}
