package z_Java_Problems.p2StringProblems;

// Check if a string is a palindrome, or if removing one character makes it one. Return the removed character's index, or indicate if it's already a palindrome or not.
public class Problem10 {

	static int findPal(String s) {
		if(isPal(s, 0, s.length()-1)) return -2;
		
		int i = 0, j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				if(isPal(s, i+1, j)) return i;
				if(isPal(s, i, j-1)) return j;
				return -1;
			}
			i++;
			j--;
		}
		return -2;
	}
	static boolean isPal(String s, int st, int end) {
		int i = st, j = end;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
    public static void main(String[] args) {
        String[] a = {"abca", "racecar", "malayalami", "abcdef"};
        for(String i: a) {
        	int n = findPal(i);
        	if(n==-2) System.out.println("Already Palindrome");
        	else if(n==-1) System.out.println("Not a Palindrome");
        	else System.out.println("Remove index "+n+" then it is palindrome");
        }
    }
}
