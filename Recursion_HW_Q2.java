public class Recursion_HW_Q2 {
    public static void convertIntoString(int num){
        
        if(num == 0){
            return;
        }
        String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int rem = num%10;
        
        convertIntoString(num/10);
        
        System.out.print(arr[rem]+" ");
    }
    public static void main(String[] args) {
        int num = 1947;
        convertIntoString(num);
    }
}
