import java.util.*;
public class Container {
    public static int Area(int num[]){
        int Maxarea=0;
        for(int i=num.length-1;i>=0;i--){
            for(int j=0;j<num.length;j++){
                int width=i-j;
                int length=Math.min(num[i],num[j]);
                Maxarea=Math.max(Maxarea,width*length);

            }
        }
        return Maxarea;

    }
    public static void main(String[] args) {
        int num[]={1,8,6,2,5,4,8,3,7};
        System.out.println(Area(num));
        
    }
    
}
