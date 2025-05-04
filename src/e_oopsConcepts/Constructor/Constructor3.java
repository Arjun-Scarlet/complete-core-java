package e_oopsConcepts.Constructor;

class Account1 {
    int accNo;
    double bal;
    static int num = 1;
    Account1(double initBal) {
        bal = initBal;
        accNo = num;
        num++;
    }
    void display(){
        System.out.println("Account No. "+accNo);
        System.out.println("Balance: "+bal);
        System.out.println("-----------");
    }
}
public class Constructor3 {
    public static void main(String[] args) {
        Account1 a1 = new Account1(5000);
        a1.display();

        Account1 a2 = new Account1(3500);
        a2.display();
    }
}
