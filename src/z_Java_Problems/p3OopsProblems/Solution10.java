package z_Java_Problems.p3OopsProblems;

/*
Input:
4
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond

Output:
50000
Cox and Kings:40000

*/

import java.util.*;
class TravelAgencies {
	private int regNo;
	private String agencyName;
	private String packageType;
	private int price;
	private boolean flightFacility;
	
	TravelAgencies(int r, String n, String t, int p, boolean f) {
		regNo = r;
		agencyName = n;
		packageType = t;
		price = p;
		flightFacility = f;
	}

	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int r) {
		regNo = r;
	}

	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String n) {
		agencyName = n;
	}

	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String t) {
		packageType = t;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int p) {
		price = p;
	}

	public boolean getFlightFacility() {
		return flightFacility;
	}
	public void setFlightFacility(boolean f) {
		flightFacility = f;
	}
	
}

public class Solution10 {

	static int findAgencyWithHighestPackagePrice(TravelAgencies[] t) {
		int max = 0;
		for(int i=0; i<t.length; i++) {
			if(t[i].getPrice()>max) {
				max = t[i].getPrice();
			}
		}
		return max;
	}
	static TravelAgencies agencyDatailsForGivenIdAndType(TravelAgencies[] t, int regNo, String ptype) {
		TravelAgencies travel = null;
		for(int i=0; i<t.length; i++) {
			int r = t[i].getRegNo();
			String p = t[i].getPackageType();
			if(t[i].getFlightFacility() && regNo == r && ptype.equals(p)) {
				travel = t[i];
			}
		}
		return travel;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TravelAgencies[] t = new TravelAgencies[n];
		for(int i=0; i<n; i++) {
			int regNo = sc.nextInt();
			sc.nextLine();
			String name = sc.nextLine();
			String ptype = sc.next();
			int price = sc.nextInt();
			boolean flight = sc.nextBoolean();
			t[i] = new TravelAgencies(regNo, name, ptype, price, flight);
		}
		int userReg = sc.nextInt();
		sc.nextLine();
		String userPtype = sc.next();
		
		System.out.println(findAgencyWithHighestPackagePrice(t));
		
		TravelAgencies travel = agencyDatailsForGivenIdAndType(t, userReg, userPtype);
		if(travel!=null) System.out.println(travel.getAgencyName()+":"+travel.getPrice());
		else System.out.println(travel);
		sc.close();
	}
}

















