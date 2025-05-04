package z_Java_Problems.p1ArraysProblem;

// Print even and odd index elements
public class Test1 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Odd index values: ");
		for(int i=0; i<a.length; i+=2) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nEven index values: ");
		for(int i=1; i<a.length; i+=2) {
			System.out.print(a[i]+" ");
		}
	}
}
