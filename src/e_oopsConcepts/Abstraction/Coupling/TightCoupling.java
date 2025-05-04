package e_oopsConcepts.Abstraction.Coupling;

//Any changes will happen in service-provider programm directly affect the service-user program called Tight Coupling
//No Easier relationship between classes
//Service-provider program
class Airtel{
 String num;
 public Airtel(String num) {
     this.num = num;
 }
 void connectCall(){
     System.out.println("Calling from ("+num+") Airtel!");
 }
}
class Jio{
 String num;
 public Jio(String num) {
     this.num = num;
 }
 void connectCall(){
     System.out.println("Calling from ("+num+") Jio!");
 }
}
class VI{
 String num;
 public VI(String num) {
     this.num = num;
 }
 void connectCall(){
     System.out.println("Calling from ("+num+") VI!");
 }
}

//Service-user program
public class TightCoupling {
 public static void main(String[] args) {
     Airtel a = new Airtel("8546060792");
     a.connectCall();
     
     VI v = new VI("7564215987");
     v.connectCall();
 }
}
