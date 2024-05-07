package Recursion;

import java.util.Scanner;

public class CheckPal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(isPal(str,0));
    }

    public static boolean isPal(String str,int i){
        if(i>= str.length()/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        }
        return isPal(str,i+1);
    }
}
