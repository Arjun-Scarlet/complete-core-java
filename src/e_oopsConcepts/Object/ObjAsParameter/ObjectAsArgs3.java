package e_oopsConcepts.Object.ObjAsParameter;

class Car{
    int carNo;
    private static int n = 1000;
    Car(){
        carNo = n++;
    }
    void start(){
        System.out.println(carNo+" car starts");
    }
    void move(){
        System.out.println(carNo+" car moving");
    }
    void stop(){
        System.out.println(carNo+" car stopped");
    }
}
public class ObjectAsArgs3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.move();
        c1.stop();
        System.out.println("-------------");
        Car c2 = new Car();
        c2.start();
        c2.stop();
    }    
}

