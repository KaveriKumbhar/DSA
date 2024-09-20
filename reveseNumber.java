import java.util.*;
public class reveseNumber {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int n = sc.nextInt();
        int ans;
        while(n>0){   
            ans = n%10;
            n = n/10;
            System.out.print(ans);
        }
    }
}
