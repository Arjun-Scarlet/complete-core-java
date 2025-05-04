package z_Java_Problems.p3OopsProblems;

/*
Input:
4
1001
Epson
30000
5
TatCliq
1002
BenQ
40000
4
Amazon
1003
Sony
80000
5
TataCliq
1004
Optomo
35000
4
Flipkart
5
Tatacliq

Output:
Projector[Id: 1003, Name: Sony, Price: 80000]

*/

import java.util.Scanner;

class Projector {
	private int projectorId;
	private String projectorName;
	private int price;
	private int rating;
	private String available;
	
	Projector(int id, String n, int p, int r, String a){
		projectorId = id;
		projectorName = n;
		price = p;
		rating = r;
		available = a;
	}
	
	public int getId() {
		return projectorId;
	}
	public void setId(int id) {
		projectorId = id;
	}
	
	public String getName() {
		return projectorName;
	}
	public void setName(String n) {
		projectorName = n;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int p) {
		price = p;
	}
	
	public int getRate() {
		return rating;
	}
	public void setRate(int r) {
		rating = r;
	}
	
	public String getAvail() {
		return available;
	}
	public void setAvail(String a) {
		available = a;
	}
	
	@Override
	public String toString() {
		return "Projector[Id: "+projectorId+", Name: "+projectorName+", Price: "+price+"]";
	}
}

public class Solution4 {

	static Projector findMaxPriceByRating(Projector[] p, int rate, String avail) {
		Projector pro = null;
		int max = p[0].getPrice();
		for(int i=0; i<p.length; i++) {
			if(p[i].getRate()==rate && p[i].getAvail().equalsIgnoreCase(avail)) {
				if(p[i].getPrice()>max) {
					max = p[i].getPrice();
					pro = p[i];
				}
			}
		}
		return pro;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Projector[] p = new Projector[n];
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String name = sc.next();
			int price = sc.nextInt();
			int rating = sc.nextInt();
			sc.nextLine();
			String avail = sc.next();
			p[i] = new Projector(id, name, price, rating, avail);
		}
		int userRating = sc.nextInt();
		sc.nextLine();
		String userAvail = sc.next();
		Projector res = findMaxPriceByRating(p, userRating, userAvail);
		if(res==null) System.out.println("No such Projector");
		else System.out.println(res);
		sc.close();
	}
}

















