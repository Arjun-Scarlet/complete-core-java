package g_regularExpression;

// regex support in String class method
public class Example14 {

	public static void main(String[] args) {
		String s1 = "a1b2c3d4e56";
		
		// replace()--> doesn't support regex
		String s2 = s1.replace("[0-9]", "");
		System.out.println("replace(): "+s2);
		
		// replaceAll()--> supports regex
		String s3 = s1.replaceAll("[0-9]", "");
		System.out.println("replaceAll(): "+s3);
		
		// split()--> supports regex
		String[] s4 = s1.split("[0-9]");
		System.out.println("split():");
		for(String s: s4) {
			System.out.println(s);
		}
	}

}
