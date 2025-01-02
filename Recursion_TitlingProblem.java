public class Recursion_TitlingProblem {
    public static int ways(int n){
        if(n==0 || n==1){
            return 1;
        }

        //ways
        //vertically palce
        int fnm1=ways(n-1);

         //Horizontally palce
         int fnm2=ways(n-2);

         //total ways 
         return fnm1+fnm2;
    }
    public static void main(String[] args) {
        System.out.println("Total number of ways ti place the tile into 2xn floor is : "+ways(4));
    }
}
