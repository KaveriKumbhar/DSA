public class array_largestNo {
    public static void findLargestNo(int arr[]){
        int largeNo=arr[0];;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largeNo)
            {
                largeNo=arr[i];
            }
        }
        System.out.println("largest no is : "+largeNo);
    }
    public static void main(String[] args) {
        int arr[]= {1000,40,20,100,150};

        findLargestNo(arr);
    }
}
