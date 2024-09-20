import java.util.*;

public class first{
public static void main(String[] args) {
    //System.out.println("this is first java pgm");

    //type conversion
    int a =25;
    float b =a ;
    System.out.println(b);

    //type conversion
    float c =25.45f;
    int d = (int)c ;
    System.out.println(d);

    char ch ='a';
    int e  = ch;
    System.out.println(e);//97

    //type promotion in Expression
    //e.g 1
    int p=10;
    char q = 'q';
    byte r =90;
    System.out.println(p+q+r);//all types are converted into integer here 

    //e.g 2
    int s =90;
    float t = 90.45f;
    long u =89;
    double v =78;
    System.out.println(s+t+u+v);//all types are converted into double here 

    //e.g 3
    byte k =5;
    //k=k*2;
    k=(byte)(k*2);
    System.out.println(k);
}
}