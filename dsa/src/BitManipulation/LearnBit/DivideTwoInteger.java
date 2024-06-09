package BitManipulation.LearnBit;

import java.util.Scanner;

public class DivideTwoInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();

        int divisor = sc.nextInt();

        boolean neg = false;

        if (divisor < 0 && dividend < 0) {
            neg = false;
        } else if (divisor < 0) {
            neg = true;
        } else if (dividend < 0) {
            neg = true;
        } else {
            neg = false;
        }

        long deno = Math.abs(divisor);
        long num = Math.abs(dividend);

        long ans = 0;

        while (num >= deno) {
            int count = 0;
            while (num >= (deno << (count + 1))) {
                count += 1;
            }
            ans += 1 << count;
            num -= (deno << count);
        }
        if (neg) {
            ans = -1 * ans;
        }
        if(ans < Integer.MIN_VALUE){
            System.out.println(Integer.MIN_VALUE);
        }
        else if (ans > Integer.MAX_VALUE){
            System.out.println(Integer.MAX_VALUE);
        }
        else System.out.println((int)ans);;
    }
}
