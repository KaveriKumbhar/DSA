import java.util.*;
public class primeEg {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                isPrime = false;
            }
        }

        if(isPrime == true)
        {
            System.out.println("it is prime no.");
        }else{
            System.out.println("it is not a prime no.");
        }
    }
}
