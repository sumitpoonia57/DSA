package Collections;
import java.util.*;


public class Hashmap {
    public static void main(String[] args) {
        Map<String,Integer> numbers=new HashMap<>();
        numbers.put("One", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        System.out.println(numbers);
        // iteration in map
        for(Map.Entry<String,Integer>e:numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());// it print key of map
            System.out.println(e.getValue());// it print the value of map
        }
        // when we require only keyt
        for(String key:numbers.keySet()){
            System.out.println(key);
        }
        // when we require only value
        for(Integer value:numbers.values()){
            System.out.println(value);
        }
        
    }
    
}
