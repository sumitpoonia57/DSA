package OOPS;
import java.util.*;
// Constructor in inheritance and use of super keyword
class Base1{
    Base1(){
      System.out.println("I am constructor");
    }
    Base1(int x){
      System.out.println("I am constructor"+x);
    }
}
class Derived extends Base1{
    Derived(){
        System.out.println("I am dervived class Construcor");
    }
    Derived(int x,int y){
        super(x); //  this keyword will call the constructor of super class construcor that have perimeter
        System.out.println("I am overloaded Constructor"+y);
    }
}
public class OverloadedConstructor {

    public static void main(String[] args) {
        Derived d=new Derived(4, 9);
        // Always remeber be default base class without parameter constructor is called first if we want to call another constructor you need to specify that constructor
        // or super key to call specific type of constructor of base class
    }
    
}
