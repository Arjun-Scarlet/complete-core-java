package z_Java_Problems.p1ArraysProblem;

/*
Find largest word in dictionary by deleting some characters of given string.
Input : dict = {"ale", "apple", "monkey", "plea"}, str = "abpcplea"  
Output : apple 

Input  : dict = {"pintu", "geeksfor", "geeksgeeks",  " forgeek"}, str = "geeksforgeeks"
Output : geeksgeeks
*/
import java.util.*;

public class Test8 {

	static boolean contain(String s, String str) {
		char[] a = str.toCharArray();
		for(int i=0; i<a.length; i++) {
			if(!s.contains(a[i]+"")) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String[] dict = {"ale", "apple", "monkey", "plea"};
		String s = "abpcplea";
		ArrayList<String> a = new ArrayList<String>();
		for(int i=0; i<dict.length; i++) {
			if(contain(s, dict[i])) {
				a.add(dict[i]);
			}
		}
		//by finding max length
		int len = 0, max = 0;
		for(int i=0; i<a.size(); i++) {
			int temp = a.get(i).length();
			if(max<temp) {
				len = i;
				max = temp;
			}
		}
		System.out.println("Largest word in dictionary: "+a.get(len));
		
		//by using sort()
		Collections.sort(a, Comparator.comparing(n->n.length()));
		System.out.println("Largest word in dictionary: "+a.get(a.size()-1));
	}
}
