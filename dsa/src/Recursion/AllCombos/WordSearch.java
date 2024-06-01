package Recursion.AllCombos;

import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rows");
        int rows = sc.nextInt();

        System.out.println("Columns");
        int columns = sc.nextInt();

        char[][] board = new char[rows][columns];

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<columns;j++){
                board[i][j] = sc.next().charAt(0);
            }
            String str = sc.next();

            System.out.println(exist(board,str));
        }

    }
    private static boolean exist(char[][] board, String word){
        return recursiveCall(0,0,0,new StringBuilder(),board,word);
    }
    private static boolean recursiveCall(int ind,int row,int column,StringBuilder temp,char[][] board, String word){
//        if(temp.toString().equals(word)){
//            return true;
//        }
//        if(row == board.length && column == board[0].length){
//            return false;
//        }
//        for(int i = row;i<board.length;i++){
//            for (int j = column;j<board[0].length;j++){
//                if (board[i][j] == temp.charAt(ind)){
//                    recursiveCall(ind+1,row,column+1,temp.append(word.charAt(ind)),board,word);
//
//                }
//            }
//        }
        return true;
    }
}
