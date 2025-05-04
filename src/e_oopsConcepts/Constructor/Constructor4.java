package e_oopsConcepts.Constructor;

class Triangle {
    int side1;
    int side2;
    int side3;
    Triangle(int s1, int s2, int s3){
        side1 = s1;
        side2 = s2; 
        side3 = s3;
    }
    Triangle(int s){
        side1 = side2 = side3 = s;
    }
    void display(){
        System.out.println("Three sides of Triangle: "+side1+", "+side2+", "+side3);
        System.out.println("-------------");
    }
}
public class Constructor4 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10, 20, 30);
        t1.display();

        Triangle t2 = new Triangle(15);
        t2.display();
    }
}
