
//This is for sorted arrays

// package GreedyAlgorithm;
// import java.util.*;

// public class activitySelection {
//     public static void main(String[] args) {
//         int start[] = {1, 3, 0, 5, 8, 5};
//         int end[] = {2, 4, 6, 7, 9, 9};

//         int maxAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();

//         maxAct = 1;
//         ans.add(0);
//         int lastEnd = end[0];

//         for(int i = 1; i < end.length; i++) {
//             if(start[i] >= lastEnd) {
//                 //select activity
//                 ans.add(i);
//                 maxAct++;
//                 lastEnd = end[i];
//             }
//         }

//         System.out.println("max activities = " + maxAct);
//         for(int i = 0; i < ans.size(); i++) {
//             System.out.println("A" + ans.get(i));
//         }
//         System.out.println();

//     }
// }


//This is for unsorted arrays

package GreedyAlgorithm;
import java.util.*;

import javax.swing.Action;

public class activitySelection {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};


        int activities[][] = new int[start.length][3];
        for(int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        //end time basis pe sorted

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for(int i = 1; i < end.length; i++) {
            if(activities [i][1] >= lastEnd) {
                //select activity
                ans.add(activities[i][0]);
                maxAct++;
                lastEnd = activities[i][2];
            }
        }

        System.out.println("max activities = " + maxAct);
        for(int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i));
        }
        System.out.println();

    }
}
