public class array_subArr {
    // public static void findMin(int sum){
    //     int min=sum;
    //     int temp;
    //     if(min<)
    // }
    // public static void findMax(int sum){
    //     int max=sum;int temp;
    // }
    public static void printSubArr(int arr[]){
        int totalSubArr=0;
        int min=0;int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                
                for(int k=i;k<=j;k++){
                    
                    
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                    if(i==0 &&j==0)
                    min=sum;
                }
                totalSubArr++;
                System.out.println();
                 System.out.println("Total sum is : "+sum);
                
                 if(min>sum){
                    min=sum;
                 }
                 if(max<sum){
                    max=sum;
                 }
                // findMin(sum);
                // findMax(sum);
                
            }
            
            System.out.println();

        }
        System.out.println("Total Sub arrays are : "+totalSubArr);
        System.out.println("min:"+min);
        System.out.println("max:"+max);
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,2,-1};
        printSubArr(arr);
    }
}
