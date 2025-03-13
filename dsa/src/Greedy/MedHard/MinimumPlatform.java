package Greedy.MedHard;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumPlatform {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] dep = new int[m];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0;i<m;i++){
            dep[i] = sc.nextInt();
        }
        System.out.println(findPlatform(arr,dep));
    }

    private static int findPlatform(int[] arr,int[] dep){
        Arrays.sort(dep);

        int len = arr.length;
        int arInd = 0;
        int depInd = 0;
        int cnt = 0;
        int ans = 0;

        while (arInd< len){
            if(arr[arInd] < depInd){
                cnt++;
                ans = Math.max(ans,cnt);
                arInd++;
            }
            else {
                depInd++;
                ans = Math.max(ans,cnt);
                cnt--;
            }
        }
        return ans;
    }
}
