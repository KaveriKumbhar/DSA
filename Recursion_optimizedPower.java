public class Recursion_optimizedPower {
    public static int optimizedPower(int base,int power){

        if(power == 0){
            return 1;
        }
        int halfPow = optimizedPower(base, power/2);
        int halfPowSq = halfPow * halfPow;

        if(power%2 != 0){
            halfPowSq = base * halfPowSq;
        }

        return halfPowSq;
    }
    public static void main(String[] args) {
        int base = 2,power=10;
        System.out.println(optimizedPower(base,power));
    }
}
