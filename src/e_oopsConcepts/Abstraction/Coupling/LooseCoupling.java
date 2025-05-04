package e_oopsConcepts.Abstraction.Coupling;

//Any changes will happen in service-provider program, directly it will not affect the service-user called Loose Coupling
//Easier relationships of classes/interface is mandatory
//Service-specifier program
@FunctionalInterface
interface Sim1{
 void makeCall();
}

//Service-provider program
class Airtel1 implements Sim1{
 @Override
 public void makeCall(){
     System.out.println("Calling from Airtel!");
 }
}
class Jio1 implements Sim1{
 @Override
 public void makeCall(){
     System.out.println("Calling from Jio!");
 }
}
class VI1 implements Sim1{
 @Override
 public void makeCall(){
     System.out.println("Calling from VI!");
 }
}

//Service-user program
class Phone1{
 Sim1 s;
 String num;
 public Phone1(Sim1 s, String num) {
     this.s = s;
     this.num = num;
 }
 void call(){
     s.makeCall();
 }
}
public class LooseCoupling {
 public static void main(String[] args) {
     Phone1 p1 = new Phone1(new Jio1(), "7556135591");
     p1.call();

     Phone1 p2 = new Phone1(new VI1(), "6397575452");
     p2.call();
 }
}
