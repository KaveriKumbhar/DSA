
public class fun_pallindromNo {
    public static void isPallindrom(int n)
    {
        int originalNo = n,newNo=0,rem=0;
        while(n>0){
            rem=n%10;
            newNo=newNo*10+rem;
            n=n/10;
        }
        if(originalNo==newNo)
        {
            System.out.println("it is pallindrom no");
        }else{
            System.out.println("it is not pallindrom no");
        }
    }
    public static void main(String[] args)
    {
        isPallindrom(121);
    }
}
