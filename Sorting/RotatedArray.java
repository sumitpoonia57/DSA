package Sorting;
// write a program to sort rotatedArray

public class RotatedArray {
    public static int Search(int num[],int target,int si,int end){
        // Base Case:-
        if(si>end){
            return -1;
        }
        // kaam
        int mid=(si+end)/2;   
        // Case 1:
        if(target==num[mid]){
            return mid;        
        }
        // Line 1:-
        // case 2:-
        if(num[si]<=num[mid]){
            // case a:-
            if(num[si]<=target && target<=num[mid-1]){
                 return Search(num, target, si, mid-1);
            }
            else{
                 return Search(num, target, mid+1, end);
            }
        }
        // Case 2:-
        // Line 2
        else{ // num[mid]<=num[end];
            // case1:-
            if(num[mid+1]<=target && target<=num[end]){
                 return Search(num, target, mid+1, end);
            }
            else{
                 return Search(num, target, si, mid-1);
            }
        }


    }
    public static void main(String[] args) {
        int num[]={4,5,6,7,0,1,2};
        int target=0;
        int index=Search(num, target, 0, num.length-1);
        System.out.println(index);
        
    }
    
}
