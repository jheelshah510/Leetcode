package Recursion.AllCombos;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
        int rows = board.length, cols = board[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (recursiveCall(0,i, j, rows,cols, board, word, new HashSet<>())) {
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean recursiveCall(int ind,int r,int c,int rows,int columns,char[][] board, String word, Set<List<Integer>> st){
        if(ind == word.length()){
            return true;
        }
        if(r < 0 || c<0 || r>=rows || c>=columns || st.contains(List.of(r,c)) || word.charAt(ind) != board[r][c]) {
            return false;
        }
        st.add(List.of(r,c));
        boolean res = (recursiveCall(ind+1,r+1,c,rows,columns,board,word,st)
                || recursiveCall(ind+1,r-1,c,rows,columns,board,word,st)
                || recursiveCall(ind+1,r,c+1,rows,columns,board,word,st)
                || recursiveCall(ind+1,r,c-1,rows,columns,board,word,st)
        );
        st.remove(List.of(r,c));
        return res;

    }
}
