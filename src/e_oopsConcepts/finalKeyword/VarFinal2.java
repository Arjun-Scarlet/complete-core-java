package e_oopsConcepts.finalKeyword;

//final variable as constant
class Circle2{
 static final double PI = 3.14; //standard way of final constant variable is uppercase

 void circleArea(int r){
     System.out.println("Area of circle: "+(PI*r*r));
 }
}
public class VarFinal2 {

	public static void main(String[] args) {
        Circle2 c = new Circle2();
        c.circleArea(15);
    }

}
