package Strings.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class IsoMorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isIsomorphic(sc.next(),sc.next());
    }
    private static boolean isIsomorphic(String s, String t){
        HashMap<Character,Character> mpST = new HashMap<>();
        HashMap<Character,Character> mpTS = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);

            if(mpST.containsKey(c1)){
                if(mpST.get(c1) != c2){
                    return false;
                }
            }

            if(mpTS.containsKey(c2)){
                if(mpTS.get(c2) != c1){
                    return false;
                }
            }
            mpST.put(c1,c2);
            mpTS.put(c2,c1);
        }
        return true;
    }
}
