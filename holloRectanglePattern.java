import java.util.*;
public class holloRectanglePattern {
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ROW NO. : ");
        r=sc.nextInt();

        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r;j++)
            {
                if(i==1||j==1||i==r||j==r)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
