package Arrays.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLeaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(leaders(arr));
    }
    private static ArrayList<Integer> leaders(int[] arr){
        int n = arr.length;
        int leader = -1;
        ArrayList<Integer> lt = new ArrayList<>();

        for(int i = n-1;i>=0;i--){
            if(arr[i] > leader){
                lt.add(arr[i]);
                leader = arr[i];
            }
        }
        Collections.reverse(lt);
        return lt;
    }
}
