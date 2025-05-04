package z_Java_Problems.Level2;

import java.util.Scanner;
public class AbundantNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n/2; i++) {
        	if(n%i==0) {
        		System.out.println(i);
        		sum += i;
        	}
        }
        if(sum>n) System.out.println("Abundant Number");
        else System.out.println("Deficient Number");
        sc.close();
	}
}
