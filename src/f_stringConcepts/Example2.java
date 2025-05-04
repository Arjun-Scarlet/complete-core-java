package f_stringConcepts;

// Some of the String methods
public class Example2 {
	public static void main(String[] args) {
		String s1 = "saiyanSHADOW";
		String s2 = "SHADOW";
		System.out.println(s1.length());

		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println("-----------");
		
		System.out.println(s1.startsWith("s"));
		System.out.println(s2.endsWith("w"));
		System.out.println(s1.contains(s2));
		System.out.println("-----------");
		
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(-1)); // RTE--> StringOutOfBoundsException
		System.out.println(s1.charAt(6)); // RTE--> StringOutOfBoundsException
	}
}
