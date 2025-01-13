public class Divide_Conquer_Q1_MergeSort {

    public static void mergeSort(String arr[],int si,int ei){
        
    }

    //print the array
    public static void printArr(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
