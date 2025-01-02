public class Recursion_FriendsPairingProblem {
    public static int friendsPairingWays(int n){
        if(n==1 || n==2){
            return n;
        }

        //for single
        int fnm1 = friendsPairingWays(n-1);

        //for pairing
        int pairing = (n-1) * friendsPairingWays(n-2);

        //total ways
        int totalWays = fnm1 + pairing;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(friendsPairingWays(3));
    }
}
