package GreedyAlgorithm;
import java.util.*;

// Given n pairs of numbers, the first num is always smaller than the second num.
//A pair (c, d) can come after pair(a, b) if b < c
//find the longest chain that can be formed of a given set of pairs,

public class MaxLenPairs {
    public static void main(String[] args) {
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int chainLen = 1;
        int chainEnd = pairs[0][1]; //chain ka end

        for(int i = 1; i < pairs.length; i++) {
            if(pairs[i][0] > chainEnd) {
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Max chain Length is : " + chainLen);

    }
}
