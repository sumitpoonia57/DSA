package Hashing;
// write a program to find size of array after performing union of two array
import java.util.*;

public class Union {
    public static int union(int a[],int b[]){
        Set<Integer> set=new HashSet<>();
        for(int element:a){
            set.add(element);
        }
        for(int element:b){
            set.add(element);
        }
        return set.size();
        
    }
    public static void main(String[] args) {
        int a[]={5,5,8,10,11};
        int b[]={3,4,5,6,6};
        System.out.println(union(a, b));
        

    }
    
}
