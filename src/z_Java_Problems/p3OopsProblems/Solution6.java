package z_Java_Problems.p3OopsProblems;

/*
Input: 
4
111
IOS
Apple
30000
222
Android
Samsung
50000
333
Symbian
HTC
12000
444
Paranoid
HTC
89000
Blackberry
Android

Output:
The given Brand is not available
222

*/

import java.util.Scanner;
class Phone {
	private int phoneId;
	private String os;
	private String brand;
	private int price;
	
	Phone(int id, String o, String b, int p){
		phoneId = id;
		os = o;
		brand = b;
		price = p;
	}

	public int getPhoneId() {
		return phoneId;
	}
	public void setPhoneId(int id) {
		phoneId = id;
	}

	public String getOs() {
		return os;
	}
	public void setOs(String o) {
		os = o;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String b) {
		brand = b;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int p) {
		price = p;
	}
	
}

public class Solution6 {

	static int findPriceForGivenBrand(Phone[] p, String brand) {
		int sum = 0;
		for(int i=0; i<p.length; i++) {
			if(brand.equalsIgnoreCase(p[i].getBrand())) {
				sum += p[i].getPrice();
			}
		}
		return sum;
	}
	static Phone getPhoneIdBasedOnOs(Phone[] p, String os) {
		Phone o = null;
		for(int i=0; i<p.length; i++) {
			if((os.equals(p[i].getOs())) && p[i].getPrice()>=50000) {
				o = p[i];
			}
		}
		return o;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Phone[] p = new Phone[n];
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String os = sc.next();
			String brand = sc.next();
			int price = sc.nextInt();
			p[i] = new Phone(id, os, brand, price);
		}
		sc.nextLine();
		String userBrand = sc.next();
		String userOs = sc.next();
		
		int res1 = findPriceForGivenBrand(p, userBrand);
		if(res1>0) System.out.println(res1);
		else System.out.println("The given Brand is not available");
		
		Phone res2 = getPhoneIdBasedOnOs(p, userOs);
		if(res2!=null) System.out.println(res2.getPhoneId());
		else System.out.println("No phones are available with specified os and price range");
		sc.close();
	}
}
















