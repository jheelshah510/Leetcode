package Arrays.Medium;

import java.util.Scanner;

public class SetMatrixZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        setZeroes(arr);
    }
        private static void setZeroes(int[][] matrix) {
            int rowSize = matrix.length;
            int colSize = matrix[0].length;

            int[] tempRow = new int[rowSize];
            int[] tempCol = new int[colSize];

            for(int i = 0;i<rowSize;i++){
                for(int j = 0;j<colSize;j++){
                    if(matrix[i][j] == 0){
                        tempRow[i] = 1;
                        tempCol[j] = 1;
                    }
                }
            }

            for(int i = 0;i<rowSize;i++){
                for(int j = 0;j<colSize;j++){
                    if(tempRow[i] == 1 || tempCol[j] == 1){
                        matrix[i][j] = 0;
                    }
                }
            }

        }
    }
