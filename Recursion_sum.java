public class Recursion_sum {
    public static int printSum(int n){
        int sum=0;
        if(n==1){
            sum=sum+n;
            return sum;
        }
        sum = n + printSum(n -1);
        return sum;
    }
    public static void main(String[] args) {
        int n=6;
        int sum=printSum(n);
        System.out.println(sum);
    }
}
