package e_oopsConcepts.Object.ObjAsReturnType;

//Object as a return type code in a single java file
import java.util.*;
class Hero{
 String name;
 String power;
 Hero(String n, String p){
     name=n;
     power=p;
 }
 void display(){
     System.out.println("Name: "+name);
     System.out.println("Power: "+power);
 }
}
 
class MakeHero{
 static Hero create(){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter name: ");
     String name = sc.nextLine();
     System.out.print("Enter power: ");
     String power = sc.nextLine();
     System.out.println("-------------");
     sc.close();
     return new Hero(name, power);
 }
}

public class ObjReturnType {
	public static void main(String[] args) {
		Hero h1 = MakeHero.create();
		h1.display();
	}
}