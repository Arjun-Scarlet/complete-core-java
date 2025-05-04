package z_Java_Problems.p4Collection;

// Integer to Roman Number conversion using map
import java.util.*;

public class Program2 {

	public static void main(String[] args) {
		int n = 2597;
		Map<Integer, String> m = new LinkedHashMap<>();
		m.put(1, "I");
		m.put(4, "IV");
		m.put(5, "V");
		m.put(9, "IX");
		m.put(10, "X");
		m.put(40, "XL");
		m.put(50, "L");
		m.put(90, "XC");
		m.put(100, "C");
		m.put(400, "CD");
		m.put(500, "D");
		m.put(900, "CM");
		m.put(1000, "M");
		
		int[] a = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		int temp = n;
		String res = "";
		for(int val: a) {
			while(temp>=val) {
				res += m.get(val);
				temp -= val;
			}
		}
		System.out.println("Roman value of "+n+" is "+res);
	}
}
