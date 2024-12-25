public class Recursion_incrDecrOrder{

    //decresing order
    public static void printDecr(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }

        System.out.print(n+" ");
        printDecr(n-1);
    }

    //increasing order
    public static void printIncr(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }

        printIncr(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        int n=10;
        printDecr(n);
        System.out.println();
        printIncr(n);
    }
}