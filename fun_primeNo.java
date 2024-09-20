import java.util.*;
public class fun_primeNo{
//     public static void isPrime(int n)
//     {
//         for(int i=2;i<=n-1;i++)
//         {
//             if(n%i==0)
//             {
//                 System.out.println("it is not prime no.");
//                 break;
//             }else{
//                 System.out.println("it is a prime no");
//                 break;
//             }
//         }
//     }
//     public static void main(String[] args)
//     {
//         int n =3;
//         isPrime(n);
//     }
// }
    //==========OPTIMIZED CODE============================================
    public static void isPrime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                System.out.println("it is not prime no.");
                break;
            }else{
                System.out.println("it is a prime no");
                break;
            }
        }
    }
    public static void main(String[] args)
    {
        int n =3;
        isPrime(n);
    }
}