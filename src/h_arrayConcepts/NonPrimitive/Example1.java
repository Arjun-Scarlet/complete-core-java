package h_arrayConcepts.NonPrimitive;

// String type Array
public class Example1 {

	public static void main(String[] args) {
		String[] s = new String[4];
		s[0] = "java";
		s[1] = "python";
		s[2] = "java";
		s[3] = "reactJs";
		
		for(String arr:s) {
			System.out.println(arr+" => "+arr.length());
		}
	}

}
