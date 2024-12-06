package Arrays;

public class A1Pairs {

    public static void pairs(int num[]) {

        int tp = 0;
        for(int i = 0; i < num.length; i++) {
            for(int j = i + 1; j < num.length; j++) {

                System.out.print("(" + num[i] + "," + num[j] + ")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("Total pairs is " + tp);
    }
    public static void main(String[] args) {
        int num [] = {2, 4, 6, 8, 10};
        pairs(num);
    }   
}

//Total number of pairs = n(n-1) / 2;

//LONGEST SUBRAY OF SUM K

// class Solution {
//     public int lenOfLongestSubarr(int[] arr, int k) {
//         // code here
      
//         //Method 1
//         // int len = 0;
//         // int n = arr.length;
        
//         // for(int i = 0; i < n; i++) {
//         //     long sum = 0;
//         //     for(int j = i; j < n; j++) {
//         //         sum += arr[j];
                
//         //         if(sum == k)
//         //             len = Math.max(len, j - i + 1);
//         //     }
//         // }
//         // return len;
        
//         //Method 2
        
//         int left = 0, right = 0;
//         long sum = arr[0];
//         int len = 0;
//         int n = arr.length;
        
//         while(right < n) {
//             while(left <= right && sum > k) {
//                 sum -= arr[left];
//                 left++;
//             }
            
//             if(sum == k) {
//                 len = Math.max(len, right - left + 1);
//             }
//             right++;
//             if(right < n) {
//                 sum += arr[right];
//             }
//         }
//         return len;
        
//     }
// }
