public class Recursion_HW_Q3 {
    public static int findLengthOfString(String str){
        
        if(str.length()==0){
            return 0;
        }

       
       return findLengthOfString(str.substring(1))+1;

    }
    public static void main(String[] args) {
        String str = "kaveri";

        System.out.println(findLengthOfString(str));
    }
}
