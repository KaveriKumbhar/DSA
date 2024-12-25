public class Array2D_transposeMatrix {

    public static void printMatrix(int matrix[][]){
        System.out.println("ORIGINAL MATRIX IS : ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int matrix[][]){
        System.out.println("TRANSPOSE MATRIX IS : ");
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2},{4,5},{6,7}};

        printMatrix(matrix);
        transposeMatrix(matrix);
    }
}
