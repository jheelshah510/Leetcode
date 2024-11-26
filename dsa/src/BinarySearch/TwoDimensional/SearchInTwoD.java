package BinarySearch.TwoDimensional;

import java.util.Scanner;

public class SearchInTwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[m][n]
        for (int i = 0 ;i<n;i++){
            for(int j = 0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        searchMatrix(matrix,sc.nextInt());
    }
    private static boolean searchMatrix(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int start = 0;
        int end = (rows * cols)-1;
        int mid = (start+end)/2;

        while (start <= end){
            int row = mid/cols;
            int col = mid%cols;

            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] < target) start = mid+1;
            else end = mid-1;
            mid = (start+end)/2;
        }
        return false;
    }
}
