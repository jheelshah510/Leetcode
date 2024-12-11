package Strings.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String ans = reverseString(str);

        System.out.println(ans);
    }

    public static String reverseString(String str){
        str =str.trim();
        int n = str.length();
        List<String> sl = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) != ' '){
                temp.append(str.charAt(i));
            }
            else {
                if(!temp.isEmpty()){
                    sl.add(temp.toString());
                }
                temp.delete(0,temp.length());
            }
        }
        if(!temp.isEmpty()){
            sl.add(temp.toString());
        }
        StringBuilder ans = new StringBuilder();

        for(int i = sl.size();i>=0;i--){
            ans.append(sl.get(i));
            if(i !=0){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
