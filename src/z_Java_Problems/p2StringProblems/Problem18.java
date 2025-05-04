package z_Java_Problems.p2StringProblems;

// Given two string s1 and s2 of same length, the task is to check whether s2 is a rotation of s1
public class Problem18 {

	static int check(String s1, String s2) {
		int n = s1.length();
		for(int i=0; i<n; i++) {
			if(s1.equals(s2)) return i;
			char last = s1.charAt(s1.length()-1);
			s1 = last+s1.substring(0, n-1);
		}
		return 0;
	}
    public static void main(String[] args) {
    	String s1 = "abcde", s2 = "bcdea";
    	System.out.println(check(s1, s2));
    }
}
