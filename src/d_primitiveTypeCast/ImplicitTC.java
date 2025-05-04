package d_primitiveTypeCast;

//Widening Type Casting
import java.util.*;
public class ImplicitTC{
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     char ch = sc.next().charAt(0);
     int i = ch;
     float f = i;
     System.out.println("char to int => "+i+"\nint to float => "+f);
     sc.close();
 }
}