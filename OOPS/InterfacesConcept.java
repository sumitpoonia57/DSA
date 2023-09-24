package OOPS;
// Interfaces Concept
interface Animal{
    void walk();
}
class Horse implements Animal{
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}
interface Herbivore{

}
class Chicken implements Animal,Herbivore{
public void walk(){
    System.out.println("walk on 3 legs");
}
}

public class InterfacesConcept {
    public static void main(String[] args) {
        
    }
    
}
