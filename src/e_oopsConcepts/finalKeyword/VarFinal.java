package e_oopsConcepts.finalKeyword;

//final variables cannot be re-initialized and it is constant
public class VarFinal {

	public static void main(String[] args) {
        final int i = 10;
        // final int j; //final variable without initialization called Blank Final Field and it cannot be accessed
        System.out.println("final variable i = "+i);
        // i++; CTE
        int j = i+1;
        System.out.println("final variable accessed by local variable j = "+j);
    }

}
