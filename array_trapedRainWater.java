public class array_trapedRainWater {
    public static int findTrapedRainWater(int Building[]){
        int n=Building.length;
        
        //1.Find Left side max height of building
        int leftMax[] = new int[n];
        leftMax[0]=Building[0];

        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(Building[i],leftMax[i-1]);
        }

        //2.Find Right side max height of building
        int rightMax[] = new int[n];
        rightMax[n-1]=Building[n-1];

        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(Building[i],rightMax[i+1]);
        }

        int trapedWater=0;

        for(int i=0;i<n;i++){
            //3.find water level 
            int waterLevel=Math.min(leftMax[i],rightMax[i]);

            //4.find trapped water
            trapedWater+=waterLevel-Building[i];
        }

        return trapedWater;
        
    }
    public static void main(String[] args) {
        int Building[]={4,2,0,6,3,2,5};

        int total=findTrapedRainWater(Building);
        System.out.println("Total traped water is : "+total);
    }
}
