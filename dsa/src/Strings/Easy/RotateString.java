package Strings.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rotateString(sc.next(),sc.next());
    }
    private static boolean rotateString(String s,String goal){
        if (s.length() != goal.length()) {
            return false;
        }
        String concatenated = s + s;
        return concatenated.contains(goal);;
    }
}
