package Recursion;

public class Learn {
    public static void main(String[] args) {

        printOneToTen(10);
    }

    private static void printOneToTen(int n){
        if(n == 1) return;

        printOneToTen(n-1);


        System.out.println(n);
    }
}
