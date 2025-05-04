package h_arrayConcepts.NonPrimitive.Comparable;

// Comparing 2 strings returns the ASCII difference of those first letters
public class Example3 {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "python";
		System.out.println(s1.compareTo(s2));//String class have overridden compareTo()
		
		String s3 = "arcade";
		String s4 = "Band";
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareToIgnoreCase(s4)); // It is not a Comparable interface method, it is a String class method
	}

}
