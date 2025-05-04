package f_stringConcepts;

// Capitalizing first and last character of a given string/sentence
public class Example38 {

	static String modCap(String s) {
	    if (s.length() == 1) {
	        return s.toUpperCase();
	    }
	    return s.substring(0, 1).toUpperCase()+s.substring(1, s.length() - 1).toLowerCase()+s.substring(s.length() - 1).toUpperCase();
	}

	public static void main(String[] args) {
		String s = "Hi Iam java a pragrammer";
		String[] a = s.split(" ");
		String res = modCap(a[0]);
		for(int i=1; i<a.length; i++) {
			res += " "+modCap(a[i]);
		}
		System.out.println(res);
	}
}
