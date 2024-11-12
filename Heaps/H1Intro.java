
package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

//Java collection frameworks
public class H1Intro {
    public static void main(String[] args) {
        // lesser the valuue of int more the priority (1 is higher priority than 2);
       // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3); //O(log n)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek()); //O(1)
            pq.remove(); //O(log n)
        }
    }
    
}