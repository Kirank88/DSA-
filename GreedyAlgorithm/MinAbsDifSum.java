package GreedyAlgorithm;
import java.util.*;
//Ques: Given two arrays find the diff of A[i] - B[j] and add all the diff and find its min
public class MinAbsDifSum {
    public static void main(String[] args) {
        int A[] = {2, 1, 3};
        int B[] = {2, 1, 3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for(int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Min Diff is : " + minDiff);
    }
}
