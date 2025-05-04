package h_arrayConcepts;

// Array Rotation
import java.util.*;
public class Example4 {
	
	static void leftRotate(int[] a) {
		int temp = a[0];
		for(int i=1; i<a.length; i++) {
			a[i-1] = a[i];
		}
		a[a.length-1] = temp;
	}
	static void rightRotate(int[] a) {
		int len = a.length-1;
		int temp = a[len];
		for(int i=len; i>0; i--) {
			a[i] = a[i-1];
		}
		a[0] = temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = {12, 20, 3, 7, 9, 10};
		System.out.println(Arrays.toString(a));
		System.out.print("No.of left rotation: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			leftRotate(a);
		}
		System.out.println("Left rotated array: "+Arrays.toString(a));
		
		System.out.print("No.of right rotation: ");
		int m = sc.nextInt();
		for(int i=1; i<=m; i++) {
			rightRotate(a);
		}
		System.out.println("Right rotated array: "+Arrays.toString(a));
		sc.close();
	}

}
