public class Divide_Conquer_SortedRotetedArr {
// using recursion
//    public static int searchTarget(int arr[], int target,int si,int ei){
//         //base case
//         if(si>ei){
//             return -1;
//         }

//         //kaam
//         int mid = si+(ei-si)/2;

//         if(target == arr[mid]){
//             return mid;
//         }

//         //line 1
//         if(arr[si]<=arr[mid]){
//             if(arr[si]<=target && target <arr[mid]){

//                 return(searchTarget(arr, target, si, mid-1));
//             }
//             else{
//                 return(searchTarget(arr, target, mid+1, ei));
//             }
//         }
        

//         //line 2
//         else{
//             if(target>=arr[mid] && target<=arr[ei]){
//                 return(searchTarget(arr, target, mid+1, ei));
//             }else{
//                 return(searchTarget(arr, target, si, mid-1));
//             }
//         }
        
// }


    //using iteration
    public static int searchUsingIteration(int arr[],int target){

        // for(int i=0;i<arr.length;i++){
        //     int mid = 
        // }
        int si=0,ei=arr.length-1;

        while(si<=ei){
            int mid = (si+ei)/2;
            if(target == arr[mid]){
                return mid;
            }

            if(arr[si]<arr[mid]){
                if(target>=arr[si] && target<mid){
                   ei=mid-1;
                    
                }else{
                    si=mid+1;
                }
            }
            else{
                if(target>=arr[mid] && target<=arr[ei]){
                    si=mid+1;
                }else{
                    ei=mid-1;
                }
            }
           
        }
       return -1;
    }

    public static void main(String[] args) {
        int arr[] = {3,4,5,6,0,1,2};
        int target = 0;
        // System.err.println("Index of target is : "+searchTarget(arr,target,0,arr.length-1));

        System.out.println(searchUsingIteration(arr, target));
    }
}
