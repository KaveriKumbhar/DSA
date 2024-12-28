public class Recursion_FirstOccurance {
    public static int firstOccurance(int arr[],int i,int key){
        if(i>arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurance(arr, i+1, key);
        // return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,7,8};
        System.out.println(firstOccurance(arr,0,8));
    }
}
