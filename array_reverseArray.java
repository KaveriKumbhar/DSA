public class array_reverseArray {

    public static void reverse(int number[]){
        int first=0,last=number.length-1;
        int temp=0;
        while(first<last){
            temp = number[first];
            number[first]=number[last];
            number[last]=temp;

            first++;
            last--;
        }
        
    }
    public static void main(String args[]){
        int number[] = {1,2,3,4,5};
        reverse(number);

        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}
