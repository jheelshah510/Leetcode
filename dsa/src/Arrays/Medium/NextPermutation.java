package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        nextPermutation(arr);
        Arrays.toString(arr);
    }

    private static void nextPermutation(int[] a) {
        int ind = -1, n = a.length;
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] < a[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            Arrays.sort(a);
        } else {
            for (int i = n - 1; i >= ind; i--) {
                if (a[i] > a[ind]) {
                    int t = a[i];
                    a[i] = a[ind];
                    a[ind] = t;
                    break;
                }
            }
            Arrays.sort(a, ind + 1, n);
        }
    }
}