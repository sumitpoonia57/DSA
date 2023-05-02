package Arrays;
// write a program to print subarrays for arrays

public class SubArrays {
    public static void subArrays(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                System.out.print("");
                for(int k=i;k<j;k++){
                    int remain=num[k];
                    System.out.print(remain+" ");


                }
          System.out.print(" ");
            }
        
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12};
         subArrays(num);
    }
    
}
