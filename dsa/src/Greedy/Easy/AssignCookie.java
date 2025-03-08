package Greedy.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class AssignCookie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] g = new int[m];
        int[] s = new int[n];

        for(int i = 0;i<m;i++){
            g[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            s[i] = sc.nextInt();
        }
        System.out.println(findContentChildren(g,s));
    }

    private static int findContentChildren(int[] g,int[] s){
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int ans = 0;

        while(i<g.length && j<s.length){
            if(g[i]<=s[j]){
                i++;
                ans++;
            }
            j++;
        }
        return ans;
    }
}
