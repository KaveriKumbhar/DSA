import java.util.*;
public class factorial {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=1;
        if(n==1||n==0)
            {
                System.out.println("1");
            }else{
        for(int i = n;i>=1;i--)
        {
            temp=temp*i;
        }
        System.out.println(temp);
    }
    }
}
