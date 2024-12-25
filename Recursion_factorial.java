public class Recursion_factorial {
    public static int factorial(int n){
        
        if(n==0){
            return 1;
        }
        
        // int nm1=factorial((n-1));
        int fact=n*factorial(n-1);
       return fact;
    }
    public static void main(String[] args) {
        int n=6;

        int fact=factorial(n);
        System.out.println(fact);
    }
}
