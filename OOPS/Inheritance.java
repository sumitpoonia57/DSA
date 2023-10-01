package OOPS;
class Shape{
    public void area(){
        System.out.println("dispaly area");
    }
}
// Single Inheritance
class Triangle extends Shape{
    public void area(int l,int b){
        System.out.println(1/2*l*b);
        
    }
}
// Hierarchical Class
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
// Mulitlevel Inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.area(4);
        
    }
    
}
