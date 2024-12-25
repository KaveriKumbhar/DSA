public class array_triplate {
    public static void findTriplateQ(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=0;k<arr.length;k++){
                    if((i!=j&&i!=k&&j!=k)&&((arr[i]+arr[j]+arr[k])==0)){
                        System.out.print("[["+arr[i]+","+arr[j]+","+arr[k]+"]],");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={-1,-0,1,2,-1,-4};
        findTriplateQ(arr);
    }
}
