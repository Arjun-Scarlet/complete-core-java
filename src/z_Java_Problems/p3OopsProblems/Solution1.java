package z_Java_Problems.p3OopsProblems;

/*
Input:
5
104
Natasha
223
102
Parker
283
105
Bruce
295
101
Strange
241
100
Stark
372

Output:
Stark
100
102
105
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
	private int id;
	private String name;
	private int totmarksobt;
	public Student(int id, String name, int totmarksobt) {
		this.id = id;
		this.name = name;
		this.totmarksobt = totmarksobt;
	} 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTotmarksobt() {
		return totmarksobt;
	}
	public void setTotmarksobt(int totmarksobt) {
		this.totmarksobt = totmarksobt;
	}
	
}

public class Solution1 {
	static String findStudentWithHighestTotal(Student[] s) {
		int max = s[0].getTotmarksobt();
		String name = s[0].getName();
		for(int i=1; i<s.length; i++) {
			if(s[i].getTotmarksobt()>max) {
				max = s[i].getTotmarksobt();
				name = s[i].getName(); 
			} 
		}
		return name.toUpperCase();
	}
	
	static List<Integer> searchStudentsBypercentage(Student[] s) {
		for(int i=0; i<s.length-1; i++) {
			for(int j=0; j<s.length-1-i; j++) {
				if(s[j].getId()>s[j+1].getId()) {
					Student temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
				}
			}  
		}
		
		List<Integer> l = new ArrayList<Integer>();
		for(int i=0; i<s.length; i++) {
			int total = s[i].getTotmarksobt();
			int percent = (70*400)/100; //70% of 400(4 subject)
			if(total>percent) {
				l.add(s[i].getId());
			}
		}
		if(l.isEmpty()) return null;
		return l;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		Student[] s = new Student[n];
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			sc.nextLine();
	        String name = sc.nextLine();
	        int tot = sc.nextInt();
	        s[i] = new Student(id, name, tot); 
		}
		System.out.println(findStudentWithHighestTotal(s));
		List<Integer> l = searchStudentsBypercentage(s);
		for(int a:l) {
			System.out.println(a);
		}
		sc.close();
	}
}
