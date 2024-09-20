
public class array_linearSearch {

    public static int searchNumber(int arr[],int key)
    {
        int index;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int key = 60;

        int index = searchNumber(arr,key);
        if(index==-1)
        {
            System.out.println("The number is not found");
        }else{
            System.out.println("The key is at "+index);
        }
    }
}
