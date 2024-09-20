import java.util.Scanner;

public class numberPyramidPtrn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=n-1;j>=i;j--)
        //     {
        //         System.out.print("-");
        //     }
        //     for(int j=1;j<=i;j++)
        //     {
        //         if((i%2==0 && j%2!=0)||(i%2!=0 && j%2!=0))
        //         System.out.print(i);
        //         else
        //         System.out.print("-");
        //     }

        //     for(int j=2;j<=i;j++)
        //     {
        //         if((i%2==0 && j%2==0)||(i%2!=0 && j%2!=0))
        //         System.out.print(i);
        //         else
        //         System.out.print("-");

        //     }
        //     for(int j=n-1;j>=i;j--)
        //     {
        //         System.out.print("-");
        //     }

        //     System.out.println();
        // }


        //--------another simple solution--------------
        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("-");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
