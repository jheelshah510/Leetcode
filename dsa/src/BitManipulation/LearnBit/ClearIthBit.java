package BitManipulation.LearnBit;

import java.util.Scanner;

public class ClearIthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number");
        int num = sc.nextInt();

        System.out.println("Shifting");
        int shift = sc.nextInt();

        shift = 1 << shift;

        shift = ~shift;

        num = num & shift;

        System.out.println(num);

    }
}
