package BinarySearch.Answers;

import java.util.ArrayList;
import java.util.Scanner;

public class BookAllocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayList<Integer> arr= new ArrayList<>();
        for (int i = 0; i < sc.nextInt(); i++) {
            arr.add(sc.nextInt());
        }
        findPages(arr,arr.size(), sc.nextInt());
    }

    private static int findPages(ArrayList<Integer> arr,int n,int m) {
        int start = -1;
        int end = 0;

        if(m>n) return -1;

        for (int i = 0; i < n; i++) {
            start = Math.max(arr.get(i),start);
            end += arr.get(i);
        }
        int mid = (start + end) / 2;
        int ans = -1;
        while (start <= end) {
            if (countPartitions(arr,m,n,mid) <= m) {
                ans = mid;
                end = mid - 1;
            } else start = mid + 1;
            mid = (start + end) / 2;
        }
        return ans;
    }

    private static int countPartitions(ArrayList<Integer> arr,int kids,int n,int pages){
        int sum = 0;
        int kiddo = 0;
        for(int i = 0;i<n;i++){
            if(sum + arr.get(i) <= pages){
                sum += arr.get(i);
            }
            else {
                sum = arr.get(i);
                kiddo++;
            }
        }
        if(sum != 0) kiddo++;
        return kiddo;
    }
}
