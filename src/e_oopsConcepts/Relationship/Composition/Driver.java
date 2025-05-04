package e_oopsConcepts.Relationship.Composition;

//Using one or more class reference object inside another class called composition
//Composition achieved if the classes have Has-a relationship

public class Driver {
 public static void main(String[] args) {
     Cars c1 = new Cars("Ford Aspire", 5757, "Blue", new Engine(1497));
     c1.display();
     System.out.println("----------");
     Cars c2 = new Cars("Rolls-Royce Ghost", 0001, "Indigo", new Engine(0));
     c2.e.cc = 1587; //Engine constructor can also be initialized like this
     c2.display();
 }
}
