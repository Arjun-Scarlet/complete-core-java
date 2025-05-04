package e_oopsConcepts.finalKeyword;

//final variable as non-primitive
class Circle{
 int radius = 10;
}
public class VarFinal1 {

	public static void main(String[] args) {
        // final non-primitive variable
        final Circle c1 = new Circle();
        System.out.println(c1.radius);

        c1.radius = 20; //can be re-initialized because its not final variable
        System.out.println(c1.radius);

        // c1 = null; --> cannot be re-initialized because Circle is final
        // c1 = new Circle(); --> cannot be re-declared because Circle is final
    }

}
