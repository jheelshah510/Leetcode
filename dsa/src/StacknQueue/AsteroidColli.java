package StacknQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class AsteroidColli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] asteroids = new int[n];

        for(int i = 0;i<n;i++){
            asteroids[i] = sc.nextInt();
        }
        System.out.println(asteroidCollision(asteroids));
    }
    private static int[] asteroidCollision(int[] asteroids){
        List<Integer> lt = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<asteroids.length;i++){
            boolean destroyed = false;
            while (!st.isEmpty() && asteroids[i] < 0 && st.peek() > 0) {
                if (st.peek() < -asteroids[i]) {
                    st.pop();
                } else if (st.peek() == -asteroids[i]) {
                    st.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                st.push(asteroids[i]);
            }

        }

        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }

}
