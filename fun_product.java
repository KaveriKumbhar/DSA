import java.util.*;
 
public class fun_product {
    public static int product(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args)
    {
        int a=2,b=3;
        int c= product(a, b);
        System.out.println("product is : "+c);

        c= product(10, 20);
        System.out.println("product is : "+c);
    }
}