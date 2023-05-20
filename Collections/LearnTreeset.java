package Collections;
import java.util.*;

public class LearnTreeset {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        // In tree set behind sccene it done all the things in sorted form 
        // it implement on binary search tree and with that also implement set properties also
        // Time Complexity O(log n)
        set.add(40);
        set.add(35);
        set.add(36);
        set.add(37);
        set.add(38);
        
        System.out.println(set);
        // remove 
        set.remove(40);
        System.out.println(set);
        // contain is use to check if element is present in set or not it is boolean function 
        System.out.println( set.contains(37));
        System.out.println(set.isEmpty());
        // it is use to check if set is empty or not
        System.out.println(set.size());// return size of set
        set.clear();
        System.out.println(set);
    }
    
}
