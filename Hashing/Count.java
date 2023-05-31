package Hashing;
// write a program to count distinct numbers of element in array
import java.util.*;

public class Count {
    public static int Distinct(int num[]){
        Set<Integer> set=new HashSet<>();
        for(int element:num){
            set.add(element);
        }
        System.out.println(set);
        return set.size();

    }
    public static void main(String[] args) {
        int num[]={5,10,5,4,5,10};
        System.out.print(Distinct(num));
        
    }
    
}
