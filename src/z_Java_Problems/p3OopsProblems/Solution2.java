package z_Java_Problems.p3OopsProblems;

/*
Input:
4
boat bassheads
boat
1220
true
over ear wired
boat
549
true
ear with mic
jbl
450
true
buds neo
realme
500
true
boat

Output:
1769
buds neo
500
*/

import java.util.Scanner;

class Headset {
	private String headsetName;
	private String headsetBrand;
	private int price;
	private boolean available;
	
	Headset(String name, String brand, int p, boolean a){
		headsetName = name;
		headsetBrand = brand;
		price = p;
		available = a;
	}
	
	public String getName() {
		return headsetName;
	}
	public void setName(String name) {
		headsetName = name;
	}
	
	public String getBrand() {
		return headsetBrand;
	}
	public void setBrand(String brand) {
		headsetBrand = brand;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int p) {
		price = p;
	}
	
	public boolean getAvail() {
		return available;
	}
	public void setAvail(boolean a) {
		available = a;
	}
}

public class Solution2 {

	static int findTotalPriceForGivenBrand(Headset[] h, String brand) {
		int total = 0;
		for(int i=0; i<h.length; i++) {
			if(brand.equals(h[i].getBrand())) {
				total+=h[i].getPrice();
			}
		}
		return total;
	}
	
	static Headset findAvailableHeadsetWithSecondMinPrice(Headset[] h) {
		Headset hs = null;
		int min1 = h[0].getPrice(), min2 = h[0].getPrice();
		for(int i=0; i<h.length; i++) {
			if(h[i].getAvail()) {
				int p = h[i].getPrice();
				if(p==min1) continue;
				if(p<min1) {
					min2 = min1;
					min1 = p;
					hs = h[i];
				}
				else if(p<min2 || min1==min2) {
					min2 = p;
					hs = h[i];
				}
			}
		}
		return hs;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		Headset[] h = new Headset[n];
		for (int i = 0; i < n; i++) {
		    String name = sc.nextLine();
		    String brand = sc.nextLine();
		    int price = sc.nextInt();
		    sc.nextLine();
		    boolean avail = sc.nextBoolean();
		    sc.nextLine();
		    h[i] = new Headset(name, brand, price, avail);
		}
		String giveBrand = sc.nextLine();
		
		int total = findTotalPriceForGivenBrand(h, giveBrand);
		if(total>0)
			System.out.println(total);
		else
			System.out.println("No Headsets Available!");
		
		Headset SecMinPrice = findAvailableHeadsetWithSecondMinPrice(h);
		if(SecMinPrice!=null)
			System.out.println(SecMinPrice.getName()+"\n"+SecMinPrice.getPrice());
		else
			System.out.println("No Headsets Available!");
		sc.close();
	}
}
