package Arrays;
// write a program to print pairs of arrays

public class Pairs {
    public static void Pairs(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+num[i]+","+num[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        Pairs(num);
        
    }

    
}
