package BitManipulation.LearnBit;

import java.util.Scanner;

public class ToggleIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number is");
        int num = sc.nextInt();

        System.out.println("toggle is");
        int toggle = sc.nextInt();

        toggle = 1 << toggle;

        num = num ^ toggle;

        System.out.println(num);

    }
}
