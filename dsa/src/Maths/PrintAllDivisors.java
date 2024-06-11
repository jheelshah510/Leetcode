package Maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        List<Integer> temp = new ArrayList<>();
        for(int i = 1;i<=Math.pow(num,1/2d);i++){
            if(num/i == i && num%i == 0){
                temp.add(i);
            }else if (num%i == 0){
                temp.add(i);
                temp.add(num/i);
            }
        }
        Collections.sort(temp);
        temp.forEach(x-> System.out.println(" "+x));
    }
}
