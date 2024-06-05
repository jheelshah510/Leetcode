package BitManipulation.LearnBit;

import java.util.Scanner;

public class SetIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number");
        int num = sc.nextInt();

        int bitToSet = sc.nextInt();

        bitToSet = 1 << bitToSet;

        num = num | bitToSet;

        System.out.println(num);
    }
}
