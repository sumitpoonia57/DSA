package OOPS;
import java.util.*;
// abstraction class
abstract class Animal{
    abstract void walk();
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walk on 2 legs");
    }
    public void run(){

    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.walk();
    }
    
}
