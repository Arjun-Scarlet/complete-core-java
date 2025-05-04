package e_oopsConcepts.Inheritance.superKeyword;

class Person{
    String name;
    Person(String n){
        name = n;
    }
}
class Doctor extends Person{
    String speciality;
    Doctor(String n, String spcl){
        super(n);
        speciality = spcl;
    }
}
public class superExample {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Rose", "Healing");
        System.out.println(d1.name);
        System.out.println(d1.speciality);
    }
}
