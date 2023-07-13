package OOPS;
import java.util.*;
// Default M
// JavaInterface Example and Default Method
interface Camera{
    void takeSnap();
    void recordVideo();
}
interface Wifi{
    String[] getNetwork();
    void connectToNetwork(); 
    default void recordMovie(){   // Deaults methods are use in interface when you does not want to break the functionalites of class and youwant to add an
        // any function to your program it can done using default key word and create method
        System.out.println("Record");
    }
}
 class MyPhone{
    void callPhoneNumber(int number){
     System.out.println("Callling"+number);
    }
    void pickNumber(){
        System.out.println("Calling....");
    }
} 
 class MySmartPhone extends MyPhone implements Camera,Wifi{
    public void takeSnap(){
        System.out.println("Take SnapShot");
    }
    public void recordVideo(){
        System.out.println("record Video");
    }
    public String[] getNetwork(){
        String[] name={"Ravi","Mukesh"};
        return name;
    }
     public void connectToNetwork(){
      System.out.println("Connecting");
    }
}
public class DefaultsMethod {
    public static void main(String[] args) {
        MySmartPhone s=new MySmartPhone();
        String ans[]=s.getNetwork();
        s.recordMovie();
        System.out.println(Arrays.toString(ans));
        
    }
    
}
