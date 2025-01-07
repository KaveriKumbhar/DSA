public class Divide_Conquer_MergeSort {
    //merge
    public static void merge(int arr[],int si,int ei,int mid){
        int temp[] = new int[ei-si+1];

        int i=si;  //index for left part
        int j=mid+1;  //index for right part
        int k=0;   //index for temporary array

        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        
        while(i<=mid){
            temp[k++]=arr[i++];
        }

        while(j<=ei){
            temp[k++]=arr[j++];
        }

        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }


    //divide
    public static void mergeSort(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;

        mergeSort(arr, si, mid);//for left part
        mergeSort(arr, mid+1, ei);//for right part
        merge(arr,si,ei,mid);//for merge

    }

    //print the array
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,5,1,7,4,6,8,-1};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
