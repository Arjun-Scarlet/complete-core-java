package e_oopsConcepts.Abstraction.Interface;

//Abstraction achieved by interface (payment process)
import java.util.*;
interface Payable{
 void pay();
}
class UPI implements Payable{
 @Override
 public void pay(){
     System.out.println("UPI transaction!");
 }
}
class NetBanking implements Payable{
 @Override
 public void pay(){
     System.out.println("Net banking transaction!");
 }
}
class CreditCard implements Payable{
 @Override
 public void pay(){
     System.out.println("Credit card transaction!");
 }
}
class Payment{
 static Payable getPayable(){ //Factory method
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Payment Process:");
     System.out.println("1. UPI\n2. Net Banking\n3. Credit Card");
     int n = sc.nextInt();
     sc.close();

     if(n==1) return new UPI();
     else if(n==2) return new NetBanking();
     else if(n==3) return new CreditCard();
     else return null;
 }
}
public class AbstractionPayment {
 public static void main(String[] args) {
     Payable p1 = Payment.getPayable();
     p1.pay();
 }
}
