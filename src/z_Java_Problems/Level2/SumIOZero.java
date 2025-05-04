package z_Java_Problems.Level2;

//Take integer inputs till the user enters 0 and print the sum of all numbers
import java.util.*;
public class SumIOZero{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum = n;
      while(n!=0){
          n = sc.nextInt();
          sum+=n;
      }
      System.out.println("Sum of numbers => "+sum);
      sc.close();
  }
}