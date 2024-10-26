package Arrays.Easy;

import java.util.*;

public class UnionOfTwoSortedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        int[] b = new int[sc.nextInt()];

        System.out.println(findUnion(a,b));
    }

    private static ArrayList<Integer> findUnion(int[] a, int[] b){
        TreeSet<Integer> ht = new TreeSet<>();

        int n = a.length;
        for(int i = 0 ;i<n;i++){
            ht.add(a[i]);
        }
        int m = b.length;

        for(int i = 0 ;i<m;i++){
            ht.add(b[i]);
        }
        return new ArrayList<>(ht);

    }

}
