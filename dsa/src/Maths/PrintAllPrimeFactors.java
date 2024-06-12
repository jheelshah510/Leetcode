package Maths;

import java.util.*;

public class PrintAllPrimeFactors {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         Set<Integer> prime = new HashSet<>();
         for(int i = 2;i<=Math.sqrt(num);i++){
             if(num% i == 0){
                 prime.add(i);
                 while (num %i == 0){
                     num = num/i;
                 }
             }
         }
         if(num != 1) prime.add(num);

        System.out.println(prime);
    }
}
