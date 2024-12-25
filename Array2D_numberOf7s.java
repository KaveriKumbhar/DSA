public class Array2D_numberOf7s {
    public static void numberOF7Occur(int matrix[][], int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        }
        System.out.println("The "+key+ " is occur "+count +" times");
    }
    public static void main(String args[]){
        int matrix[][] = {{4,7,8},{8,8,7}};
        int key = 8;
        numberOF7Occur(matrix, key);
    }
}
