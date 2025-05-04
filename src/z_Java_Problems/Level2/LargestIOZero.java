package z_Java_Problems.Level2;

//Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.*;
public class LargestIOZero {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int max = n;
      while(n!=0){
          n = sc.nextInt();
          if(max<n)
          max = n;
      }
      System.out.println("Maximum of numbers => "+max);
      sc.close();
  }
}