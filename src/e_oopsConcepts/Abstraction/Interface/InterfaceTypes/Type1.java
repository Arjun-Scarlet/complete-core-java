package e_oopsConcepts.Abstraction.Interface.InterfaceTypes;

//Regular interface is also known as Interface

interface Pen{
 void write();
 default void rewrite(){
     System.out.println("Pen rewrite");
 }
} 
class Author implements Pen{
 @Override
 public void write(){
     System.out.println("Author write");
 }
}
public class Type1 {
 public static void main(String[] args) {
     Pen p1 = new Author();
     p1.write();
     p1.rewrite();
 }
}
