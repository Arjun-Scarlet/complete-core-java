package e_oopsConcepts.Object;

//Number as an object and its state and behaviour
class Number {
  int num;
  int isLength(){
      int n = num, len = 0;
      while(n>0){len++; n/=10;}
      System.out.print("Length of number => ");
      return len;
  }
  int digitSum(){
      int n = num, sum = 0;
      while(n>0){
          sum+=n%10;
          n/=10;
      }
      System.out.print("Sum of digit => ");
      return sum;
  }
  boolean isPrime(){
      int n = num;
      System.out.print("Is Prime => ");
      for(int i=2; i<n/2; i++){
          if(n%i==0) return false;
      }
      return true;
  }
}
public class ObjExample3 {
  public static void main(String[] args) {
      Number n1 = new Number();
      n1.num = 1359;
      System.out.println(n1.digitSum());
      System.out.println(n1.isLength());
      System.out.println("-------------");
      Number n2 = new Number();
      n2.num = 157;
      System.out.println(n2.isLength());
      System.out.println(n2.isPrime());
  }
}
