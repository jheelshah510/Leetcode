package BinarySearch.Answers;

import java.util.Scanner;

public class CapacityToShipPack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        shipWithinDays(arr, sc.nextInt());
    }
    private static int shipWithinDays(int[] weights,int days){
        int n = weights.length;

        int end = 0;
        int start = 1;

        for (int i = 0;i<n;i++){
            end+= weights[i];

            if(weights[i] > start){
                start = weights[i];
            }
        }

        int ans = -1;
        int mid = (start+end)/2;

        while(start<=end){
            if(calcWeigDays(weights,n,mid)<=days){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;

            mid = (start+end)/2;
        }

        return ans;

    }

    private static int calcWeigDays(int[] cap,int n,int totalCap){
        int cnt = 0;
        int temp = 0;
        for (int i =0;i<n;i++){
            if(temp + cap[i] <= totalCap){
                temp += cap[i];
            }
            else {
                cnt+=1;
                temp = cap[i];
            }
        }
        if (temp !=0) cnt+=1;
        return cnt;
    }
}
