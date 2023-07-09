package OOPS;
import java.util.*;
class MyException extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }
    @Override
    public String getMessage(){
        return " I am getMessage()";
    }
}
public class Execptions {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a<9){
            try{
                throw new ArithmeticException("This is Exception");

            }
            catch(Exception e){
              System.out.println(e.getMessage());
              System.out.println(e.toString());
              System.out.println("Finished");
            }
        }
    }
    
}
