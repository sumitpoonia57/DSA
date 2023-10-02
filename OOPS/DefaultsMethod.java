package OOPS;
import java.util.*;
// JavaInterface Example and Default Method
interface Camera{
    void takeSnap();
    void recordVideo();
}
interface Wifi{
    String[] getNetwork();
    void connectToNetwork(); 
}
 class MyPhone{
    void callPhoneNumber(int number){
     System.out.println("Callling"+number);
    }
    void pickNumber(){
        System.out.println("Calling....");
    }
} 
 class SmartPhone extends MyPhone implements Camera,Wifi{
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
        SmartPhone s=new SmartPhone();
        String ans[]=s.getNetwork();
        System.out.println(Arrays.toString(ans));
        
    }
    
}
