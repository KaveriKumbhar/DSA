public class array_peakElement {
    public static void findPeakEle(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if ( (arr[i] >= arr[i + 1])) {
                    System.out.println(1);
                }
            } 
            else if(i == arr.length - 1){
                if ((arr[i] >= arr[i - 1])){
                    System.out.println(1);
                }
            }          
            else {
                if ((arr[i] >= arr[i - 1]) || (arr[i] >= arr[i + 1])) {
                    System.out.println(1);
                }
            }
            break;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        findPeakEle(arr);
    }
}
