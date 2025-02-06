package Recursion.Subsequence;

import java.util.Scanner;

public class GenerateBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        genBinaries(k,new char[3],0);
    }

    private static void genBinaries(int k,char[] temp,int ind){
        if(ind == k){
            String a = new String(temp);
            System.out.println(a);
            return;
        }
        temp[ind] = '0';
        genBinaries(k,temp,ind+1);
        temp[ind] = '1';
        genBinaries(k,temp,ind+1);
    }
}
