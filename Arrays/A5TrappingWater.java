package Arrays;

public class A5TrappingWater {

    public static int trappedWater(int height[]) {
    //calculate left max boundary - array
    int n = height.length;
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for(int i = 1; i < n; i++) {
        leftMax[i] = Math.max(height[i], leftMax[i-1]);
    }
      
    //calculate right max boundary - array
    int rightMax[] = new int[n];
    rightMax[n-1] = height[n-1];
    for(int i = n-2; i >= 0; i--) {
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }

    int trappedWater = 0;
    //loop
    for(int i = 0; i < n; i++) {
    //water level = min(leftMax bound, rightMax bound)
      int  waterLevel = Math.min(leftMax[i], rightMax[i]);

      //Trapped water = waterLevel - height[i]
        trappedWater += waterLevel - height[i];
    } 
    return trappedWater;

   
    
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedWater(height));
    }
}
