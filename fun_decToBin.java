public class fun_decToBin {
    public static void decToBin(int n)
    {
        int rem=0,binNo=0,power=0;
        while(n>0){
            rem=n%2;
            binNo +=rem*Math.pow(10,power);
            n=n/2;
            power++;
        }
        System.out.println(binNo);
    }
    public static void main(String[] args)
    {
        decToBin(12);
    }
}
