package BitManipulation.InterviewProb;

import java.util.Scanner;

public class MinimumBitToFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int goal = sc.nextInt();

        int result = start ^ goal;

        int ans = 0;

        while(result > 1){
            ans += result & 1;
            result = result >> 1;
        }
        if(result == 1) ans++;

        System.out.println(ans);
    }
}
