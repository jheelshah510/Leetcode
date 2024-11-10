package Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class FindRepeatingNdMissNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findTwoElement(arr));
    }
    private static ArrayList<Integer> findTwoElement(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> lt = new ArrayList<>();
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i = 1;i<=n;i++){
            mp.put(i,0);
        }

        for(int i = 0;i<n;i++){
            mp.put(arr[i],mp.get(arr[i])+1);
        }
        int repeated = -1, missing = -1;
        for (int i = 1; i <= n; i++) {
            if (mp.get(i) == 2) {
                repeated = i;
            } else if (mp.get(i) == 0) {
                missing = i;
            }
        }

        lt.add(repeated);
        lt.add(missing);
        return lt;
    }
}
