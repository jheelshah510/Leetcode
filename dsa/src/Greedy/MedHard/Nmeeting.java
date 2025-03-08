package Greedy.MedHard;

import java.util.*;

public class Nmeeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[m];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            end[i] = sc.nextInt();
        }
        System.out.println(maxMeetings(start, end));
    }

    private static int maxMeetings(int[] start, int[] end) {
       int len = start.length;
       List<int[]> lt = new ArrayList<>();

       for(int i = 0;i<len;i++){
           lt.add(new int[]{start[i],end[i]});
       }
       lt.sort(Comparator.comparingInt(x -> x[1]));

       int count = 0;
       int lastEndTime = -1;

       for(int[] meeting:lt){
           if(meeting[0] > lastEndTime){
               lastEndTime = meeting[1];
               count++;
           }
       }
       return count;
    }
}
