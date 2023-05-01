package Arrays;
// Find the index of given element in array
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int marks[]={12,13,14};
        for(int i=0;i<marks.length;i++){
            if(marks[i]==13){
                System.out.println(i);
            }
            else{
                System.out.println("Invalid Index");

            }

        }
    }
    
}
