package z_Java_Problems.Level3_0;

//Odd or Even without conditional statements and loops
import java.util.*;
public class EvenOrOdd2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = {"Even", "Odd"};
        System.out.println(arr[n&1]);
        sc.close();
    }
}
