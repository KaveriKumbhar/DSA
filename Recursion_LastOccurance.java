public class Recursion_LastOccurance {
        public static int lastOccurance(int arr[],int i,int key){
            if(i<0){
                return -1;
            }
            if(arr[i]==key){
                return i;
            }
            return lastOccurance(arr, i-1, key);
            // return 0;
        }
        public static void main(String[] args) {
            int arr[] = {1,4,5,2,7,8,4};
            System.out.println(lastOccurance(arr,arr.length-1,4));
        }
    }
    

