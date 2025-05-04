package z_Java_Problems.Level2;

import java.util.Scanner;
public class HarshadNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, temp = n;
        while(temp>0) {
        	sum += temp%10;
        	temp/=10;
        }
        if(n%sum==0) System.out.println("Harshad Number");
        else System.out.println("Not an Harshad Number");
        sc.close();
	}
}
