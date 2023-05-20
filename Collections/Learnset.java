package Collections;
import java.util.*;

public class Learnset {
    // in set duplicates element are not allowed
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        // in set hashing is done due to which there is differnent order of element is print when we print set again and again  
        set.add(40);
        set.add(35);
        set.add(36);
        set.add(37);
        set.add(38);
        // in set order is not define
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
