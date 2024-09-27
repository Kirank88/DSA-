package Stacks;
import java.util.*;
//Find second largest element towards right
public class Stack6Largest {
    
    public static void main(String[] args) {
        
        //int arr[] = {6, 8, 0, 1, 3};
        int arr[] = {7,3,4,2,0,6};
        Stack<Integer> s = new Stack<>();

        int nextGreater[] = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--)  {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i] = arr[s.peek()];

            }

            s.push(i);
        }

        for(int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();

        //Similar question based on same logic
        // 1. next greater left
        // change for loop traverse from left to right
        // 2. smaller in right
        // in while loop change arr[s.peek()] <= TO >=
        // 3.Smaller in left
        // change both the above conditions
    }
}
