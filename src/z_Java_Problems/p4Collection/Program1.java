package z_Java_Problems.p4Collection;

// Roman Number to Integer Conversion using map
import java.util.LinkedHashMap;
import java.util.Map;

public class Program1 {

	public static void main(String[] args) {
		String s = "MMDXCVII";
		Map<String, Integer> m = new LinkedHashMap<>();
    	m.put("I",1);
    	m.put("IV",4);
    	m.put("V",5);
    	m.put("IX",9);
    	m.put("X",10);
    	m.put("XL",40);
    	m.put("L",50);
    	m.put("XC",90);
    	m.put("C",100);
    	m.put("CD",400);
    	m.put("D",500);
    	m.put("CM",900);
    	m.put("M",1000);
    	String[] a = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

    	String temp = s;
    	int num = 0;
    	for(String val: a) {
    		while(temp.startsWith(val)) {
    			num += m.get(val);
    			temp = temp.substring(val.length());
    		}
    	}
    	System.out.println("Integer value of "+s+" is "+num);
    }
}
