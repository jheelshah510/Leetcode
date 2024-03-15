package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String ans = reverseString(str);

        System.out.println(ans);
    }

    public static String reverseString(String str){

        str.trim();

        String[] arr = str.split("\\s+");

        System.out.println(Arrays.toString(arr));

        String rev = "";

        for(int i =arr.length-1;i>0;i--){
            rev += arr[i];
            rev += " ";
        }
        rev += arr[0];

        return rev.trim();
    }
}
