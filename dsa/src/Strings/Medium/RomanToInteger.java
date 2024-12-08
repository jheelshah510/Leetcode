package Strings.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int res = romanToInt(s);

        System.out.println(res);
    }

    public static int romanToInt(String s) {
        HashMap<Character,Integer> values = new HashMap<>();
        values.put('I',1);
        values.put('V',5);
        values.put('X',10);
        values.put('L',50);
        values.put('C',100);
        values.put('D',500);
        values.put('M',1000);
        int res = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(i!=0 && (values.get(s.charAt(i)) > values.get(s.charAt(i-1)))){
                res += values.get(s.charAt(i)) - values.get(s.charAt(i-1));
                i--;
            }
            else res+= values.get(s.charAt(i));
        }
        return res;
    }
}
