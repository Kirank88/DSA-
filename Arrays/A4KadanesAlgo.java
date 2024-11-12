package Arrays;

public class A4KadanesAlgo {
     

    public static void maxSubArray(int num[]) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for(int i = 0; i < num.length; i++) {
            curSum += num[i];
            if(curSum < 0) {
                curSum = 0;
            }
           maxSum = Math.max(curSum, maxSum);
        }
        System.out.println("The maximum sum is :" + maxSum);

    } 
    public static void main(String[] args) {
        int num [] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubArray(num);
    }
}
