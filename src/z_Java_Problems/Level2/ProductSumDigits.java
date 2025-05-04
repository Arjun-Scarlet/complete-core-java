package z_Java_Problems.Level2;

//Subtract the Product and Sum of Digits of an Integer
import java.util.*;
public class ProductSumDigits{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp = n, sum = 0, mul = 1;
      while(temp>0){
          sum+=temp%10;
          mul*=temp%10;
          temp/=10;
      }
      int result = mul-sum;
      System.out.println(result);
      sc.close();
  }
}