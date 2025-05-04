package d_primitiveTypeCast;

//Narrowing Type Casting
import java.util.*;
public class ExplicitTC{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     double d = sc.nextDouble();
     int i = (int)d;
     System.out.println("double to int => "+i+"\nint to char => "+(char)i);
     sc.close();
 }
}