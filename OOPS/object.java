package OOPS;
class Pen{
    String color;
    String type;
    public  void write(){
       System.out.println("write something");
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Non parameterizedd Constructor
   //// Student(String name,int age){
        //this.name=name;
        //this.age=age;
    //}
    // we need to declare empty Constructor
    Student(){

    }
    // Copy Construcor
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
}
public class object {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Sumit";
        s1.age=21;
        Student s2=new Student(s1);
        s2.printInfo();
        
    }
    
}
