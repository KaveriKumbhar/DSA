public class sorting_bubbleSort {
    public static void bubbleSort(int arr[]){
        int swap=0;
        for(int turn=0;turn<arr.length-1;turn++){
            // if(turn!=0 && swap==0){
            //     for(int i=0;i<arr.length;i++){
            //         System.out.print(arr[i]+" ");
            // }
            // }
                for(int j=0;j<arr.length-1-turn;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                    swap++;
                }
            
        }
    }

    // public static void printSortingArr(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //             System.out.print(arr[i]+" ");
    //     }
    // }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        bubbleSort(arr);
        // printSortingArr(arr);
    }
}
