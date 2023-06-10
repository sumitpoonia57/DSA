import java.util.*;

public class Path {
    public static void shortestpath(String paths){
        int x=0;
        int y=0;
        for(int i=0;i<paths.length();i++){
            if(paths.charAt(i)=='N'){
                y++;
            }
            else if(paths.charAt(i)=='S'){
                y--;
            }
            else if(paths.charAt(i)=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        float distance=(float)Math.sqrt(x*x+y*y);
         System.out.println(distance);
    }
    public static void main(String[] args) {
        String paths="WNEENESENNN";
        shortestpath(paths);
    }
    
}
