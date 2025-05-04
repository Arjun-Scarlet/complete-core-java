package e_oopsConcepts.Object;

//Rectangle as an object and its state and behaviour
class Rectangle {
  int length;
  int breadth;
  void initialize(int l, int b){
      length = l;
      breadth = b;
      display();
  }
  void display(){
      System.out.println("Length: "+length+" and Breadth: "+breadth);
  }
  void displayArea(){
      System.out.println("Area of Rectangle => "+length*breadth);
  }
  void displayPerimeter(){
      System.out.println("Perimeter of Rectangle => "+2*(length+breadth));
  }
}
public class ObjExample1 {
  public static void main(String[] args) {
      Rectangle r1 = new Rectangle();
      r1.initialize(10, 20);
      r1.displayArea();

      Rectangle r2 = new Rectangle();
      r2.initialize(20, 30);
      r2.displayPerimeter();
  }
}
