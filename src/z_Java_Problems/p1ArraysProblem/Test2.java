package z_Java_Problems.p1ArraysProblem;

// Sum of even index and odd index elements
public class Test2 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int sum1 = 0, sum2 = 0;
		for(int i=0; i<a.length; i++) {
			if(i%2==0) sum1 += a[i];
			else sum2 += a[i];
		}
		System.out.println("Sum of Even index element: "+sum1);
		System.out.println("Sum of Odd index element: "+sum2);
		System.out.println("Sum of Even index and Odd index element: "+(sum1+sum2));
	}
}
