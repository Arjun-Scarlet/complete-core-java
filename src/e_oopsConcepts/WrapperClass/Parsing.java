package e_oopsConcepts.WrapperClass;

// Converting a string to its corresponding primitive type is called Parsing(uses parse methods) 
// Every primitive data types have its parse methods except char
public class Parsing {
	public static void main(String[] args) {
		String s1 = "5";
		String s2 = "10.5f";
		String s3 = "10.25";
		String s4 = "true";
		String s5 = "Hello";
		System.out.println(Integer.parseInt(s1));
		System.out.println(Float.parseFloat(s2));
		System.out.println(Double.parseDouble(s3));
		System.out.println(Boolean.parseBoolean(s4));
		System.out.println(Integer.parseInt(s5)); //RTE-->NumberFormatException
	}
}
