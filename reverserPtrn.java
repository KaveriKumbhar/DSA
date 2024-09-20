import java.util.*;
public class reverserPtrn {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ROW NO. : ");
        r=sc.nextInt();

        for(int i=1;i<=r;i++)
        {
            for(int j=r;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
