package f_stringConcepts;

// indexOf() --> used to find index of the char/substring within a string
// If the char/substring is there returns its starting index, else returns -1
public class Example35 {

	public static void main(String[] args) {
		String str = "developer";
		System.out.println(str.indexOf('e')); // returns index of 1st occurrence
		System.out.println(str.indexOf('a')); // if the element is not exist it returns -1
		System.out.println(str.indexOf('e',4)); // it checks from 4th index
		System.out.println(str.indexOf('l', 5));
		System.out.println(str.indexOf("vel")); // returns its starting index
		System.out.println(str.indexOf("ve",1));
	}

}
