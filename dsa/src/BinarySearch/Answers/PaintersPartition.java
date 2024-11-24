package BinarySearch.Answers;

import java.util.ArrayList;
import java.util.Scanner;

public class PaintersPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> boards = new ArrayList<>();
        for(int i = 0;i<n;i++){
            boards.add(sc.nextInt());
        }
        findLargestMinDistance(boards,sc.nextInt());
    }
    private static int findLargestMinDistance(ArrayList<Integer> boards,int k){
        int start = -1;
        int end = 0;
        int n = boards.size();
        for(int i = 0;i<n;i++){
            end +=boards.get(i);
            start = Math.max(boards.get(i),start);
        }
        int mid = (start+end)/2;
        int ans = -1;
        while (start<=end){
            if(calcWorkers(boards,mid)<=k){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;

            mid = (start+end)/2;
        }
        return ans;
    }
    private static int calcWorkers(ArrayList<Integer> boards,int sz){
        int sum = 0;
        int workers = 0;

        for (int i = 0;i<boards.size();i++){
            if(sum + boards.get(i) <= sz){
                sum += boards.get(i);
            }
            else {
                workers++;
                sum = boards.get(i);
            }
        }
        if(sum!=0) workers++;
        return workers;
    }
}
