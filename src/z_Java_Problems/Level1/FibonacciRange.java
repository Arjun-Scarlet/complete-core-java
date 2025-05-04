package z_Java_Problems.Level1;

import java.util.*;
public class FibonacciRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int f1 = 0, f2 = 1;
		System.out.print(f1+" "+f2+" ");
		for(int i=3; i<=n; i++){
		    int f3 = f1+f2;
		    if(f3<=n){
		        System.out.print(f3+" ");
		        f1 = f2;
		        f2 = f3;
            }
		}
        sc.close();
	}
}