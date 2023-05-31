package Hashing;
// write a program to return size of array after performing intersection of two array
import java.util.*;

public class Intersection {
    public static int Intersection(int a[],int b[]){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    set.add(a[i]);
                }
            }
        }
        return set.size();

    }
    public static void main(String[] args) {
        int a[]={5,10,15,5,10};
        int b[]={15,10,4};
      System.out.println(Intersection(a, b));

        
    }
    
}
