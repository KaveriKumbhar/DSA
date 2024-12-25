public class sorting_countingSort {
    public static void countingSort(int arr[]){
        //finding largest nmber in array
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }

        //frequency counting array
       int count[] = new int[largest+1];
       for(int i=0;i<count.length;i++){
        count[arr[i]]++;
       }

       int j=0;
       for(int i=0;i<count.length;i++){
        while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
       }
    }
    public static void printSortingArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countingSort(arr);
        printSortingArr(arr);
    }
}
