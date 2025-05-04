package h_arrayConcepts;
// Array re-initialization by using copyOf()
// Array resizing according to another array
import java.util.Arrays;
public class Example16 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		int[] b = new int[0];//initial array size is 0
		
		System.out.println("b: "+Arrays.toString(b)+", Length: "+b.length);// empty array
		
		for(int i=0; i<a.length; i++) {
			b = Arrays.copyOf(b, b.length+1);
			b[b.length-1] = a[i]; // resizing the 'b' array size according to 'a' array
		}
		System.out.println("a: "+Arrays.toString(a)+", Length: "+a.length);
		System.out.println("b: "+Arrays.toString(b)+", Length: "+b.length);
	}
}
