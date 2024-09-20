public class fun_binomialCoeficient {
    public static int factorial(int n)
    {
        int fact=1;
        for(int i=n;i>=1;i--)
        {
            fact *=i;
        }
        return fact;
    }

    public static void binomial_fact()
    {
        int a=3,r=2;
        int a_fact=factorial(a);
        int r_fact=factorial(r);
        int amr_fact=factorial(a-r);
        System.out.println((a_fact/(r_fact*amr_fact)));
    }
    public static void main(String []args)
    {
        binomial_fact();
    }
}