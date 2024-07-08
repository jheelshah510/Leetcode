package SlidingTwoPointers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        System.out.println(characterReplacement(s,k));
    }
    private static int characterReplacement(String s,int k){
        int ans = 0;
        int n = s.length();
        int right = 0;
        int left = 0;
        HashMap<Character,Integer> mpp = new HashMap<>();

        while (right<n){
            if(mpp.containsKey(s.charAt(right))){
                mpp.put(s.charAt(right),mpp.get(s.charAt(right))+1);
            }
            else mpp.put(s.charAt(right),1);
            int len0fWindow = right-left+1;

            if(len0fWindow - Collections.max(mpp.values()) <= k){
                ans = Math.max(len0fWindow,ans);
            }
            else{
                mpp.put(s.charAt(left), mpp.get(s.charAt(left)) - 1);
                left++;
            }
            right++;

        }
        return ans;
    }
}
