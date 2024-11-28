package BinarySearch.TwoDimensional;

import java.util.Scanner;

public class SearchInMatrixTwo {
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
        searchMatrix(matrix,sc.nextInt());
    }
    private static boolean searchMatrix(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length && col>=0){
            if(matrix[row][col] == target) return true;

            else if(matrix[row][col] < target){
                row +=1;
            }
            else col -=1;
        }
        return false;
    }
}
