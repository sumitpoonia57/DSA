import java.util.*;
public class AdvanceRecursion5 {
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+"");
        }
        System.out.println();
    }
    // write a program to print all subset of set of first n natural numbers
    public static void SubSet(int n,ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;

        }
        // Include in subset
        SubSet(n-1, subset);
        subset.add(n);
        // DoesNot want to include in subset
        SubSet(n-1, subset);
        subset.remove(subset.size()-1);

    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer>subset=new ArrayList<Integer>();
        SubSet(n,subset);
        

        
    }
    
}
