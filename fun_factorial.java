public class fun_factorial {
    public static void factorial(int a)
    {
        if(a==1||a==0)
        {
            System.out.println("factorial is 1");
        }
        int fact=1;
        for(int i=a;i>=1;i--)
        {
            fact *=i;
        }
        System.out.println("factorial is : "+fact);
    }
    public static void main(String[] args) {
        int a=5;
        factorial(a);
    }
}
