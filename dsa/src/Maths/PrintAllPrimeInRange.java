package Maths;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllPrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countPrimes(n));
    }

    private static int countPrimes(int n){
        int count = 0;
        List<Integer> lt = new ArrayList<>(n+1);
        for(int i = 0;i<n;i++){
            lt.add(1);
        }

        for(int i = 2;i * i <= n;i++){
            if(lt.get(i) == 1){
                for(int j = i*i;j<n;j+=i){
                    lt.set(j,0);
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (lt.get(i) == 1) {
                count++;
            }
        }
        return count;
    }
}
