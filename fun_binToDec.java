import java.util.*;
public class fun_binToDec {
    public static void binToDec(int n)
    {
        int lastDigit=0 ,decimalNo=0,power=0;
        for(int i=n;i>=1;i--)
        {
            lastDigit=n%10;
            n=n/10;  
            decimalNo+=(lastDigit*Math.pow(2, power));
           // decimalNo=decimalNo+(lastDigit*(int)Math.pow(2, power));//===type cast double to int========
            power++;
        }
        System.out.println(decimalNo);
    }
    public static void main(String[] args)
    {
        binToDec(1001);
    }
}
