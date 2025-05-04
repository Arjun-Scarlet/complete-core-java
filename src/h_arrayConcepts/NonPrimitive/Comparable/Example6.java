package h_arrayConcepts.NonPrimitive.Comparable;

import java.util.Arrays;
class Account implements Comparable<Account>{
	double bal;
	Account(double b){
		bal = b;
	}
	
	@Override
	public String toString() {
		return "Account[Balance: "+bal+"]";
	}
	@Override
	public int compareTo(Account a) {
		if(bal>a.bal) return 1;
		if(bal<a.bal) return -1;
		return 0;
	}
	
}
public class Example6 {
	public static void main(String[] args) {
		Account[] a = new Account[4];
		a[0] = new Account(1500.25);
		a[1] = new Account(1500.51);
		a[2] = new Account(1500.97);
		a[3] = new Account(1500.18);
		Arrays.sort(a);
		for(Account n:a) System.out.println(n);
	}
}
