package e_oopsConcepts.Abstraction.Abstract;

abstract class Vehicle{
    abstract void start();
    abstract void move();
    abstract void stop();
} 
class Ferrari extends Vehicle{
    @Override
    void move() {
        System.out.println("Ferrari starts");
    }

    @Override
    void start() {
        System.out.println("Ferrari moving");
    }

    @Override
    void stop() {
        System.out.println("Ferrari stops");
    }    
}
class FerrariX extends Ferrari{ 
    // Overriding is not mandatory here because it is not extending abstract Vechicle class
}
class Honda extends Vehicle{
    @Override
    void move() {
        System.out.println("Honda starts");
    }

    @Override
    void start() {
        System.out.println("Honda moving");
    }

    @Override
    void stop() {
        System.out.println("Honda stops");
    }    
}
class Jaguar extends Vehicle{
    @Override
    void move() {
        System.out.println("Jaguar starts");
    }

    @Override
    void start() {
        System.out.println("Jaguar moving");
    }

    @Override
    void stop() {
        System.out.println("Jaguar stops");
    }    
}
class Driver{
    static void drive(Vehicle v){
        v.start();
        v.move();
        v.stop();
    }
}
public class ExAbstract2 {
    public static void main(String[] args) {
        Driver.drive(new Jaguar());
        System.out.println("---------");
        Driver.drive(new FerrariX());
    }
}