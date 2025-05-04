package e_oopsConcepts.finalKeyword;

//final variables can be initialized by blocks as well as constructor
class Account2{
 final int accNo;
 static int n = 1000;
 // using constructor
 Account2(){
     accNo = n;
     n++;
 }

 /* using blocks
 {
     accNo = n;
     n++;
 }
 */ 
 void display(){
     System.out.println("Accoount No: "+accNo);
 }
}
public class VarFinal3 {

	public static void main(String[] args) {
        Account2 a1 = new Account2();
        a1.display();
        
        Account2 a2 = new Account2();
        a2.display();
    }

}
