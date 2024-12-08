package Strings.Medium;

import java.util.*;

public class SortCharByFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        frequencySort(sc.next());
    }
    private static String frequencySort(String s){
        HashMap<Character,Integer> mp = new HashMap<>();

        for(int i = 0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        HashMap<Integer, ArrayList<Character>> mp2 = new HashMap<>();

        for(Character c:mp.keySet()){
            if(mp2.containsKey(mp.get(c))){
                ArrayList<Character> cl = mp2.get(mp.get(c));
                cl.add(c);
                mp2.put(mp.get(c),cl);
            }
            else {
                ArrayList<Character> temp = new ArrayList<>();
                temp.add(c);
                mp2.put(mp.get(c), temp);
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i = s.length();i>=0;i--){
            if(mp2.containsKey(i)){
                for(int k = 0;k<mp2.get(i).size();k++){
                    for(int j = 0;j<i;j++){
                        ans.append(mp2.get(i).get(k));
                    }
                }
            }
        }
        return ans.toString();
    }
}
