package Arrays.Medium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class LongestConseqSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(longestConsecutive(arr));
    }
    private static int longestConsecutive(int[] nums){
        int n = nums.length;
        if(n == 0) return 0;

        Set<Integer> st = new HashSet<>();

        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        int maxLen = 0;

        for(int el: st){
            if(!st.contains(el-1)){
                int cnt = 1;
                int x = el;
                while(st.contains(x+1)){
                    x = x+1;
                    cnt++;
                }
                maxLen = Math.max(maxLen,cnt);
            }
        }
        return maxLen;
    }
}
