package SlidingTwoPointers;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstringWithoutRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(lengthOfLongestSubstring(s));
    }
    private static int lengthOfLongestSubstring(String s){
        int maxLen = 0;
        int len = s.length();
        int left = 0;
        int right = 0;
        HashMap<Character,Integer>  mpp= new HashMap<>();

        while(right < len){
            if(mpp.containsKey(s.charAt(right))){
                if(mpp.get(s.charAt(right)) >= left){
                    left = mpp.get(s.charAt(right)) + 1;
                }
            }
            maxLen = Math.max(maxLen,right-left+1);
            mpp.put(s.charAt(right),right);
            right++;
        }
        return maxLen;

    }
}
