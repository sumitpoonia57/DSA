package OOPS;
// Polymorphism method Dynamic Dispa
import java.util.*;
// Implementation of Dynamic Method Dispatch
class Phone{
    public void on(){
        System.out.println("Phone is on");
    }
}
class SmartPhone extends Phone{
    @Override
    public void on(){
     System.out.println("Smart Phone is on");
    }
}

public class DynamicMethod {
    public static void main(String[] args) {
        Phone p=new SmartPhone();
        p.on();
    }
    
}
