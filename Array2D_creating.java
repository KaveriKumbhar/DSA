import java.util.Scanner;

public class Array2D_creating {
    public static boolean findKeyValue(int matrix[][],int key,int n,int m){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println("The key is found at index ("+i+","+j+")");
                    return true;
                    
                }
            }
        }
       return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        System.out.println("Enter elements for 2D array");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        //output
        System.out.println("Matrix is : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        int key=10;
        boolean a=findKeyValue(matrix,key,n,m);
        if(a==false){
            System.out.println("The key is not found ");
        }
    }
}
