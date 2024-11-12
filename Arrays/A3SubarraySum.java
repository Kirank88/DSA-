package Arrays;

public class A3SubarraySum {

    public static void subarray(int num[]){
        int ts = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        int curSum = 0;

        for(int i = 1 ; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i ];
        }

        for(int i = 0; i < num.length; i++) {
            int start = i;
            //int sum;
            for(int j = i; j < num.length; j++) {
                int end = j;
                curSum =start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
               
                //System.out.print(" ->Sum = " + curSum);
                if(max < curSum) {
                    max = curSum;
                }
                
                ts++;
                System.err.println();
            }
            System.out.println();
        }
        System.out.println("Max subarray sum is: " + max);;
        System.out.println("Total subarray =" + ts);

    }
    public static void main(String[] args) {
        int num [] = {1, -2, 6, -1, 3};
        subarray(num);
    
        
    }
    
}
