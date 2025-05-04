package z_Java_Problems.p1ArraysProblem;

// Print prime numbers present in array
public class Test3 {

	static boolean isPrime(int n) {
		boolean flag = true;
		if(n<2) return false;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) flag = false;
		}
		return flag;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<a.length; i++) {
			if(isPrime(a[i])) System.out.print(a[i]+" ");
		}
	}
}
