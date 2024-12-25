public class array_pairs {
    public static void findPairs(int num[]){
        int totalPair=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+num[i]+","+num[j]+") ");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("TOTAL PAIRS ARE : "+totalPair);
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6};
        findPairs(num);
    }
}
