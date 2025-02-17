//Trapping rain water drops . 
public class A11_TrappingRainWater {
     
    public static int trappedRainwater(int height[]){
        //calculate left max boundry.
        int n= height.length;
        int leftmax[] = new int [n];
        leftmax[0]=height[0];
        for(int i=1 ; i<n; i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate right max boundry .
        int rightmax[]=new int [n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2 ; i>=0; i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0; i<n; i++){
            //water level = min(max bound left, max bound right)
            int waterlevel=Math.min(leftmax[i], rightmax[i]);

            //trapped water = waterlevel - height .
            trappedWater += waterlevel - height[i];
        }
            return trappedWater;
    }

    public static void main(String[] args) {
        int height []={4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}
