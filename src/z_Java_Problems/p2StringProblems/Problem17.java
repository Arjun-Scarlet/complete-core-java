package z_Java_Problems.p2StringProblems;

// Character rotation in a string

public class Problem17 {

	static String right(String s, int n) {
		for(int i=1; i<=n; i++) {
			char last = s.charAt(s.length()-1);
			s = last+s.substring(0, s.length()-1);
		}
		return s;
	}
	static String left(String s, int n) {
		for(int i=1; i<=n; i++) {
			char first = s.charAt(0);
			s = s.substring(1, s.length())+first;
		}
		return s;
	}
	public static void main(String[] args) {
		String s1 = "Saiyan";
		int n = 2;
		System.out.println("Original String: "+s1);
		s1 = right(s1,n);
		System.out.println("After Right Rotation: "+s1);
		System.out.println("-----------");
		
		String s2 = "Scarlet";
		System.out.println("Original String: "+s2);
		s2 = left(s2,n);
		System.out.println("After Left Rotation: "+s2);
	}
}
