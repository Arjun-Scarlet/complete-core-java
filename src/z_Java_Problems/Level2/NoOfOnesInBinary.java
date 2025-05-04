package z_Java_Problems.Level2;

import java.util.Scanner;
public class NoOfOnesInBinary {
	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
    	int bin = 0;
    	int i = 1, cnt = 0;
    	while(n>0) {
    		int rem = n%2;
    		if(rem==1) cnt++;
    		bin += rem*i;
    		i*=10;
    		n/=2;
    	}
    	System.out.println("No. of one's in "+bin+" -> "+cnt);
    	sc.close();
	}
}
