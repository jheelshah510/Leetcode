package Recursion.Learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllSubs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        List<Integer> arr = new ArrayList<>();

        for(int i =0 ;i<size;i++){
            arr.add(sc.nextInt());
        }
        printAllSub(0, new ArrayList<>(),arr,size);
    }
    protected static void printAllSub(int ind,List<Integer> ds,List<Integer> arr,int size){
        if(ind >= size){
            System.out.println(ds.toString());
            return;
        }
        ds.add(arr.get(ind));
        printAllSub(ind+1,ds,arr,size);
        ds.remove(ds.size()-1);
        printAllSub(ind+1,ds,arr,size);
    }
}
