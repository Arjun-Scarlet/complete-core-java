package e_oopsConcepts.Abstraction.Interface.InterfaceTypes;

//Creating an empty interface or interface without any methods and data members called Marker or Tagged Interface
//This interface is used to pass some instructions to JVM

interface Washable{ //marker interface

}
class TV{

}
class Laptop{

}
class Bike implements Washable{

}
class Car implements Washable{

}
class Washer{
 static void washCheck(Object o){
     if(o instanceof Washable){
         System.out.println(o.getClass().getSimpleName()+" is washable");
     }
     else System.out.println(o.getClass().getSimpleName()+" is not washable");
 }
}
public class Type2 {
 public static void main(String[] args) {
     Car c1 = new Car();
     Washer.washCheck(c1);

     Laptop b1 = new Laptop();
     Washer.washCheck(b1);
 }
}
