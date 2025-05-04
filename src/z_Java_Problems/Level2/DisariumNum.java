package z_Java_Problems.Level2;

import java.util.Scanner;
public class DisariumNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, temp = n, cnt = 0;
        while(temp>0) {
        	cnt++;
        	temp/=10;
        }
        temp = n;
        while(temp>0) {
        	int rem = temp%10;
        	sum += Math.pow(rem, cnt);
        	temp/=10;
        	cnt--;
        }
        if(n==sum) System.out.println("Disarium Number");
        else System.out.println("Not a Disarium Number");
        sc.close();
	}
}
