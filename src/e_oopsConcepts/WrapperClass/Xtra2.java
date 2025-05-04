package e_oopsConcepts.WrapperClass;

public class Xtra2 {
	public static void main(String[] args) {
		Integer a = 120;
		Integer b = 120;
		int c = 120;
		System.out.println(a==b); //memory allocated in cache memory
		System.out.println(a==c); 
		System.out.println("-------");
		Integer d = 130;
		Integer e = 130;
		int f = 130;
		System.out.println(d==e); //range-->0-127. After that memory allocated in head area
		System.out.println(d==f);
	}
}
