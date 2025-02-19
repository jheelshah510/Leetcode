package Recursion.AllCombos;

import java.util.List;
import java.util.Scanner;

public class ExpressionAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int target = sc.nextInt();
        System.out.println(addOperators(num,target));
    }

    private static List<String> addOperators(String num,int target){
        return null;
    }
}
