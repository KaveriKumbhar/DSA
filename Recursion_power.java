public class Recursion_power {
    public static double calPower(int base,int power){
        if(power==0){
            return 1;
        }
        // Math.pow(base, power);
        double ans= base * (Math.pow(base, power-1));
        return ans;
    }
    public static void main(String[] args) {
        int base=2,power=10;
        System.out.println(calPower(base,power));
        
    }
}
