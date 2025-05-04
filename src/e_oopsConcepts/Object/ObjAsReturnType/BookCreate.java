package e_oopsConcepts.Object.ObjAsReturnType;

//Creating a static method with object as a return type is known as Factory Method
import java.util.*;
class BookCreate {
 static Book Create(){ //Book class as return type
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Title: ");
     String title = sc.nextLine();
     System.out.print("Enter Author: ");
     String author = sc.nextLine();
     System.out.print("Enter Price: ");
     double price = sc.nextDouble();
     sc.close();
     return new Book(title, author, price);
 }
}
