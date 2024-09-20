import java.util.*;

class continueEg{
    public static void main(String[] args)
    {
        do
        {
            System.out.println("ENTER A NUMBER : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n%10==0)
            {
                continue;
            }
            else
            System.out.println(n);
        }while(true);
    }
}