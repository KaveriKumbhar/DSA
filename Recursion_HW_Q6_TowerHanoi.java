public class Recursion_HW_Q6_TowerHanoi {
    public static void towerOfHanoi(int disk,String src,String helper, String dest){
        if(disk==1){
            System.out.println("The disk "+disk+" is transfer from source "+src+" to destination "+dest);
            return;
        }

        towerOfHanoi(disk-1, src, dest, helper);

        System.out.println("The disk "+disk+" is transfer from source "+src+" to destination "+dest);

        towerOfHanoi(disk-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int disk = 4;
        towerOfHanoi(disk,"A","B","C");
    }
}
