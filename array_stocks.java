public class array_stocks {
    public static int findProfit(int prices[]){
        int buyingP=Integer.MAX_VALUE;
        int maxProfit=0; int profit=0;

        for(int i=0;i<prices.length;i++){
            if(buyingP<prices[i]){
                profit= prices[i]-buyingP;
                maxProfit=Math.max(maxProfit, profit);
            }else{
                buyingP=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(findProfit(prices));
    }
}
