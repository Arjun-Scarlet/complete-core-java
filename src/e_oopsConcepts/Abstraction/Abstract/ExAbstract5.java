package e_oopsConcepts.Abstraction.Abstract;

abstract class Shape {
    String color;
    Shape(String c){
        color = c;
    }
    abstract void display();
    abstract void getArea();
}
class PerfectBox extends Shape{
    int size;
    PerfectBox(String color, int s){
        super(color);
        size = s;
    }
    @Override
    void display() {
        System.out.println("PerfectBox color: "+color);
        System.out.println("Size: "+size);
    }
    @Override
    void getArea() {
        System.out.println("Area of PerfectBox: "+size*size);
    }
}
class PerfectCircle extends Shape{
    int radius;
    PerfectCircle(String color, int r){
        super(color);
        radius = r;
    }
    @Override
    void display(){
        System.out.println(color+" PerfectCircle:");
        System.out.println("Radius: "+radius);
    }
    @Override
    void getArea(){
        System.out.println("Area of PerfectCircle: "+(3.14*radius*radius));
    }
}
public class ExAbstract5 {
    public static void main(String[] args) {
        Shape s1 = new PerfectBox("yellow", 10);
        s1.display();
        s1.getArea();
        System.out.println("------------");
        s1 = new PerfectCircle("Blue", 10);
        s1.display();
        s1.getArea();
    }
}
