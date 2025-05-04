package a_interview;

import java.util.*;
public class Program3 {

	static boolean same(String s1, String s2) {
		while(true) {
			if(s1.length()!=s2.length()) return false;
			if(s1.length()==0 && s2.length()==0) return true;
			char c = s1.charAt(0);
			s1 = s1.replace(c+"", "");
			s2 = s2.replace(c+"", "");
		}
	}
	static boolean search(List<String> l, String s) {
		for(int i=0; i<l.size(); i++) {
			if(s.equals(l.get(i))) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String[] a = {"dog","cat","god","act","name"};
		List<String> l = new ArrayList<>();
		for(int i=0; i<a.length; i++) {
			String temp = a[i];
			for(int j=i+1; j<a.length; j++) {
				if(same(temp,a[j])) {
					l.add(temp);
					l.add(a[j]);
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			if(search(l,a[i])) continue;
			else System.out.println(a[i]);
		}
	}
}
