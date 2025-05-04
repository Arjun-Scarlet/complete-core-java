package e_oopsConcepts.thisKeyword;

//this keyword
public class thisExample1 {
  int i;
  void m1(int i){
      System.out.println("this keyword reference value => "+this.i);
      System.out.println("current object value => "+i);
      this.i = i;
  }
  void display(){
      //this keyword helps to refer current object address to the non static variable
      System.out.println("reference of current object value => "+i);
      System.out.println("----------------");
  }
  
  //this keyword only used inside non static method and constructor 
  static void m2(int i){
      System.out.println("this keyword cannot be used inside static method...");
      // System.out.println(this.i);
  }
  public static void main(String[] args) {
      thisExample1 t1 = new thisExample1();
      t1.i = 10;
      t1.display();
  
      thisExample1 t2 = new thisExample1();
      t2.m1(15);
      t2.display();

      m2(20);
  }
}
