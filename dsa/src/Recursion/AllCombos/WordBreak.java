package Recursion.AllCombos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> wordDict = new ArrayList<>(sc.nextInt());
        for(int i = 0;i<wordDict.size();i++){
            wordDict.add(i,sc.next());
        }
        System.out.println(wordBreak(s,wordDict));

    }

    private static boolean wordBreak(String s , List<String> wordDict){
        return recursiveCall(s,wordDict,0,0);
    }

    private static boolean recursiveCall(String s , List<String> wordDict,int start,int end){
        if(end == s.length()){
            return wordDict.contains(s.substring(start, end + 1));
        }
        if(wordDict.contains(s.substring(start,end+1))){
            if(recursiveCall(s,wordDict,end+1,end+1)){
                return true;
            }
        }
        return recursiveCall(s,wordDict,start,end+1);

    }
}
