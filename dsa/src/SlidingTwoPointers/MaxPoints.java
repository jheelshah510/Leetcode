package SlidingTwoPointers;

import java.util.Scanner;

public class MaxPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] cardPoints = new int[n];
        for(int i= 0;i<n;i++){
            cardPoints[i] = sc.nextInt();
        }
        System.out.println(maxScore(cardPoints,k));
    }

    private static int maxScore(int[] cardPoints,int k){
        int n = cardPoints.length;
        int totalSum = 0;

        for (int i = 0; i < k; i++) {
            totalSum += cardPoints[i];
        }

        int maxPoints = totalSum;
        int rightIndex = n - 1;

        for (int i = k - 1; i >= 0; i--) {
            totalSum = totalSum - cardPoints[i] + cardPoints[rightIndex];
            maxPoints = Math.max(maxPoints, totalSum);
            rightIndex--;
        }

        return maxPoints;
    }
}
