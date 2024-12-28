public class Recursion_fibonacciSeries {
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        
        int fbnm1 = fibonacci(n-1);
        int fbnm2 = fibonacci(n-2);

        int fb=fbnm1+fbnm2;
        return fb;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(fibonacci(n));
    }
}
