public class fun_allPrime {

    public static boolean isPrime(int k)
    {
        for(int i=2;i<=k-1;i++)
        {
            if(k%i==0){
                return false;
            }             
        }
        return true;
    }
    public static void allPrime(int n)
    {
        for(int i=2;i<=n;i++)
        {
            boolean allNo= isPrime(i);
            if(allNo==true)
            {
                System.out.println(i);
            }
        } 
    }
    public static void main(String[] args)
    {
        allPrime(5);
    }
}
