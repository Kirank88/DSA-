package Hashing;
import java.util.*;

//..HASHMAP are unordered
public class H1Intro {
    //create
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        
        //Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

       int population  =  hm.get("India");
       System.out.println(population);

       System.out.println(hm.containsKey("India"));

       System.out.println(hm.remove("India"));

       //Size
       System.out.println(hm.size());

       //Is Empty
       System.out.println(hm.isEmpty());

       hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys );

        for(String k: keys) {
            System.out.println("key=" + k + ",value=" + hm.get(k));
        }

    }
}
