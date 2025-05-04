package e_oopsConcepts.DesignPattern.Singleton;

//Singleton class is a class which allows maximum of one instance of a class
class Single{
 private static Single s = null;
 private Single(){}

 public static Single getInstance(){ //Factory method or Object as return type
     if(s==null)
     s = new Single();
     return s;
 }
}
public class ExampleSingleton {
 public static void main(String[] args) {
     // If we create n no. of object also, we will get same address(i.e: it will create only one instance)
     Single s1 = Single.getInstance();
     System.out.println("Pseudo address of s1: "+s1);

     Single s2 = Single.getInstance();
     System.out.println("Pseudo address of s2: "+s2);

     System.out.println(s1.equals(s2)); //equals() is used to compare 2 objects
 }
}
