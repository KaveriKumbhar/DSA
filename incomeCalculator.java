import java.util.*;
public class incomeCalculator{
    public static void main(String args[])
    {
        System.out.println("ENTER YOUR AMOUNT : ");
        double tax;
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        

        if(amount<=0)
        {
            tax=0;
            System.out.println("tax is : "+tax);
        }
        else if(amount>0 && amount <=10 )
        {
            tax = amount*0.2;
            System.out.println("tax is : "+tax);
        }
        else{
            tax=(amount*0.3);
            System.out.println("tax is : "+tax);
        } 
    }
}