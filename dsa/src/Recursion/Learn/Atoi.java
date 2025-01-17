package Recursion.Learn;

import java.util.Scanner;

public class Atoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

     int ans = myAtoi(str);

      System.out.println(ans);
    }

    public static int myAtoi(String s){
        s = s.trim();
        int i = 0;
        int sign = 1;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if (s.charAt(i) == '+'){
            sign = 1;
            i++;
        }
        int j = i;
        while(j< s.length()){
            if(Character.isDigit(s.charAt(j))){
                j++;
            }
            else {
                break;
            }

        }

        int ans = atoi(0,s.substring(i,j));
        Long val = 4L;
        int k = (Integer.parseInt(val.toString()));
        return sign * ans;

    }
    private static int atoi (int i,String s){
        if(s.length() == 0){
            return 0;
        }
        return s.charAt(s.length()-1)- '0' + atoi(i,s.substring(i,s.length()-1))*10;
    }

}
