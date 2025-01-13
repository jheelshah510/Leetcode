package Recursion.Learn;

public class Learn {
    public static void main(String[] args) {

        printOneToTen(10);
        printNToOne(10);
    }

    private static void printOneToTen(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }

        printOneToTen(n-1);


        System.out.println(n);
    }
    private static void printNToOne(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNToOne(n-1);
    }
}
