package e_oopsConcepts.Inheritance.MethodOverride;

class Animal{
    void makeSound(){

    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Bow Bow...");
    }
}
class Puppy extends Dog{
    @Override
    void makeSound(){
        System.out.println("Weep Weep...");
    }
}
class Cat extends Animal{

    @Override
    void makeSound() {
        System.out.println("Meow Meow...");
    }
}
public class OverrideExample2 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.makeSound();

        Puppy p1 = new Puppy();
        p1.makeSound();
    }
}
