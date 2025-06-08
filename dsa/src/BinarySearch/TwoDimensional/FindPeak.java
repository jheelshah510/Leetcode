package BinarySearch.TwoDimensional;

import java.util.Scanner;

public class FindPeak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0 ;i<n;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        findPeakGrid(matrix);
    }
    private static int[] findPeakGrid(int[][] mat){
        int start = 0;
        int end = mat[0].length-1;
        int mid = (start + end)/2;
        while (start <= end){
            int maxi = maxEl(mat,mid);
            int left = (mid > 0) ? mat[maxi][mid-1] : -1;
            int right = (mid < mat[0].length-1) ? mat[maxi][mid+1] : -1;

            if(mat[maxi][mid] > left && mat[maxi][mid] > right){
                return new int[]{maxi,mid};
            }
            else if(mat[maxi][mid] < right){
                start = mid+1;
            }
            else end = mid-1;

            mid = (start+end)/2;
        }
        return new int[]{-1,-1};
    }

    private static int maxEl(int[][] mat,int col){
        int maxEl = -1;
        int ind = -1;
        for(int i = 0;i<mat.length;i++){
            if(mat[i][col] > maxEl){
                maxEl = mat[i][col];
                ind = i;
            }
        }
        return ind;
    }
}
