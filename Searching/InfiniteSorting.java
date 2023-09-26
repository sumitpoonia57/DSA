package Searching;
// write a program to sort element from infinte sorted array

// InfintieSorting
public class InfiniteSorting {
    public static int Range(int num[],int key,int low,int high)
    {
        low=0;
        high=1;
        while(num[high]<key){
            low=high;
            high=high*2;
        }
         return Sort(num,key,low,high);
    }
    public static int Sort(int num[],int key,int si,int ei ){
          // kaam
          int mid=(si+ei)/2;
          if(num[mid]==key){
              return mid;
          }
          if(key>num[mid]){
             return  Sort(num, key, mid+1, ei);
          }
          return Sort(num, key, si, mid-1);
  
    }
    public static void main(String[] args) {
        int num[]={2,3,4,5,6,7};
        int key=5;
        
        System.out.println(Range(num, 5, 0,1));  
    }
    
}
