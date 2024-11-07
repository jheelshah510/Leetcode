package Arrays.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PscalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(generate(sc.nextInt()));
    }
    private static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0;i<numRows;i++){
            List<Integer> lt = new ArrayList<>();
            lt.add(1);
            for(int j = 1;j<i;j++){
                lt.add(ans.get(i-1).get(j-1)+ ans.get(i-1).get(j));
            }
            if(i> 0) lt.add(1);
            ans.add(lt);
        }
        return ans;
    }
}
