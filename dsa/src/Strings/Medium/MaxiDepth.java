package Strings.Medium;

import java.util.Scanner;

public class MaxiDepth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        maxDepth(sc.next());
    }
    private static int maxDepth(String s){
        int n = s.length();
        int temp = 0;
        int ans = 0;
        for(int i = 0;i<n;i++){
            if(s.charAt(i) == '('){
                temp++;
            }
            else if (s.charAt(i) == ')'){
                ans = Math.max(temp,ans);
                temp--;
            }
        }

        return temp;
    }
}
