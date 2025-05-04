package h_arrayConcepts;

// Check whether two array elements are exactly equal or not
public class Example9 {
	static boolean arrayEqual(int[] a, int[] b) {
		if(a.length!=b.length) return false;
		for(int i=0; i<a.length; i++) {
			if(a[i]!=b[i]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {2,3,1,4,5};
		if(arrayEqual(a, b)) System.out.println("Both arrays are equal");
		else System.out.println("Both arrays are not equal");
	}

}
