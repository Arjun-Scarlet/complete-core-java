package e_oopsConcepts.Object;

//Account as an object and its state and behaviour
class Account {
  double bal;
  void currBal(){
      System.out.println("Your Current balance => "+bal);
  }
  void withdraw(int amt){
      if(amt>bal){
          System.out.println("Insufficient Balance...");
          return;
      }
      System.out.println(amt+"Rs. withdraw completed");
      bal-=amt;
      currBal();
      System.out.println("-------------------------------");
  }
}
public class ObjExample2 {
  public static void main(String[] args) {
      Account a1 = new Account();
      a1.bal = 5000;
      a1.currBal();
      a1.withdraw(2750);

      Account a2 = new Account();
      a2.bal = 2000;
      a2.currBal();
      a2.withdraw(2500);
  }
}
