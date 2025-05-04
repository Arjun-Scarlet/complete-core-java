package e_oopsConcepts.Constructor;

//Copy constructor helps to copy the ref into other ref with different ref address
class Square{
 int length;
 int breadth;
 Square(int l, int b){
     length = l;
     breadth = b;
 }
 Square(Square s){ //copy constructor
     length = s.length;
     breadth = s.breadth;
 }
 void display(){
     System.out.println("Length: "+length+" and Breadth: "+breadth);
     System.out.println("-------------");
 }
}
public class CopyConstructor {
 public static void main(String[] args) {
     Square s1 = new Square(10, 20);
     System.out.println(s1); //Fully qualified class_name
     s1.display();

     Square s2 = new Square(s1); //copying s1 into s2 by using copy constructor
     System.out.println(s2); //s1 and s2-->different address
     s2.display();

     Square s3 = s1; //copying s1 to s3 without using copy constructor
     System.out.println(s3); //s1 and s3-->same address
     s3.display();
 }
}
