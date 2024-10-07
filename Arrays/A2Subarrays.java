package Arrays;

public class A2Subarrays {

    public static void subarray(int num[]){
        int ts = 0;
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num.length; i++) {
            int start = i;
            int sum;
            for(int j = i; j < num.length; j++) {
                int end = j;
                sum = 0;
                for(int k = start; k <=  end; k++) {
                    System.out.print(num[k] + " ");
                    sum += num[k];
                }
                System.out.print(" ->Sum = " + sum);
                if(max < sum) {
                    max = sum;
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
