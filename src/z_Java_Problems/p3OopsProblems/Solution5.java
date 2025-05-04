package z_Java_Problems.p3OopsProblems;

/*
Input:
4
111
Amrita
5000
10000
Chennai
222
Karunya
16000
20000
Coimbatore
333
AppleTech
10000
12000
Chennai
444
Aruna
6000
10000
Vellore
Chennai
Karunya

Output:
22000
Karunya::A 

*/

import java.util.*;
class Institution {
	private int institutionId;
	private String institutionName;
	private int noOfStudentsPlaced;
	private int noOfStudentsCleared;
	private String location;
	private String grade;
	
	Institution(int id, String name, int p, int c, String l) {
		institutionId = id;
		institutionName = name;
		noOfStudentsPlaced = p;
		noOfStudentsCleared = c;
		location = l;
	}

	public int getInstitutionId() {
		return institutionId;
	}
	public void setInstitutionId(int id) {
		institutionId = id;
	}

	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String name) {
		institutionName = name;
	}

	public int getNoOfStudentsPlaced() {
		return noOfStudentsPlaced;
	}
	public void setNoOfStudentsPlaced(int p) {
		noOfStudentsPlaced = p;
	}

	public int getNoOfStudentsCleared() {
		return noOfStudentsCleared;
	}
	public void setNoOfStudentsCleared(int c) {
		noOfStudentsCleared = c;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String l) {
		location = l; 
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String g) {
		grade = g;
	}
	
}

public class Solution5 {

	static int findNumClearancedByLoc(Institution[] a, String loc) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			if(loc.equalsIgnoreCase(a[i].getLocation())) {
				sum += a[i].getNoOfStudentsCleared();
			}
		}
		return sum;
	}
	static Institution updateInstitutionGrade(Institution[] a, String name) {
		Institution o = null;
		for(int i=0; i<a.length; i++) {
			if(name.equalsIgnoreCase(a[i].getInstitutionName())) {
				o = a[i];
			}
		}
		if(o!=null) {
			int rating = (o.getNoOfStudentsPlaced()*100)/o.getNoOfStudentsCleared();
			if(rating>=80) o.setGrade("A");
			else o.setGrade("B");
		}
		return o;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Institution[] a = new Institution[n];
		for(int i = 0; i < n; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.next();
			int placed = sc.nextInt();
			int cleared = sc.nextInt();
			sc.nextLine();
			String location = sc.next();
			a[i] = new Institution(id, name, placed, cleared, location);
		}
		String userLoc = sc.next();
		String userInsName = sc.next();
		
		int res1 = findNumClearancedByLoc(a, userLoc);
		if(res1>0) System.out.println(res1);
		else System.out.println("There are no cleared students in this particular location");
		
		
		Institution res2 = updateInstitutionGrade(a, userInsName);
		if(res2!=null) System.out.println(res2.getInstitutionName()+"::"+res2.getGrade());
		else System.out.println("No Institute is available with the specified name");
		sc.close();
	}
}














