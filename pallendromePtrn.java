import java.util.Scanner;

public class pallendromePtrn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }

            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
