import java.util.*;
public class practiceLoopQ {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER A NO. : ");
        int n = sc.nextInt();
        int evenSum=0,oddSum=0;
        System.out.println("ENTER THE "+n +" VALUES ");
        for(int i=1 ; i<=n ; i++)
        {
            int num = sc.nextInt();
             if(num%2==0)
             {
                evenSum+=num;
             }
             else{
                oddSum+=num;
             }
        }

        System.out.println("EVEN NO. SUM IS : "+evenSum);
        System.out.println("ODD NO. SUM IS : "+oddSum);
    }
}
