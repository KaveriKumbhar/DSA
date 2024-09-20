import java.util.Scanner;

public class zeroOnePtrn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int temp=1;
        for(int i=1;i<=n;i++)
        {
                for(int j=1;j<=i;j++)
                { 
                    if(i%2==0 && j==1)
                    {
                        temp=0;
                    }
                    if((i%2!=0 && j==1))

                    {
                        temp=1;
                    }
                    System.out.print(temp+" ");
                    if(temp==0){
                        temp=1;
                    }else{
                        temp=0;
                    }
                    
                
            }

            
            
            System.out.println();
        }
    }
}
