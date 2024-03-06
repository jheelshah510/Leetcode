package Strings;

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
        int res = 0;
        HashMap<Character,Integer> mp = new HashMap<>();

        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);

        for(int i = s.length()-1;i>=0;i--){
            if(i!=0 && mp.get(s.charAt(i)) > mp.get(s.charAt(i-1))){
                res += mp.get(s.charAt(i)) - mp.get(s.charAt(i-1));
                i--;
            }
            else{
                res += mp.get(s.charAt(i));
            }
        }
        return res;
    }
}
