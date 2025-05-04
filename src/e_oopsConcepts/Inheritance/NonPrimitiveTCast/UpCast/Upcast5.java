package e_oopsConcepts.Inheritance.NonPrimitiveTCast.UpCast;

//Upcasting with same variable name

class Cast12{
 int i = 10;
 static int j = 15;
}
class Cast13 extends Cast12{
 int i = 20;
 static int j = 25;
}
class Cast14 extends Cast12{
 int i = 30;
 static int j = 35;
}
public class Upcast5 {
 @SuppressWarnings("static-access")
 public static void main(String[] args) {
     Cast12 c1 = new Cast13();
     System.out.println("i = "+c1.i+", j = "+c1.j);

     c1 = new Cast14();
     System.out.println("i = "+c1.i+", j = "+c1.j);
 }   
}
