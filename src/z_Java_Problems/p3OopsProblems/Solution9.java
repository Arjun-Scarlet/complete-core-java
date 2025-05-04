package z_Java_Problems.p3OopsProblems;

/*
Input:
4
dolo650
FAC124W
fever
100
paracetamol
PAC545B
bodypain
150
almox
ALM747S
fever
200
aspirin
ASP849Q
flu
250
fever

Output:
100
200

*/

import java.util.*;
class Medicine {
	private String medicineName;
	private String batch;
	private String disease;
	private int price;
	
	Medicine(String n, String b, String d, int p){
		medicineName = n;
		batch = b;
		disease = d;
		price = p;
	}

	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String n) {
		medicineName = n;
	}

	public String getBatch() {
		return batch;
	}
	public void setBatch(String b) {
		batch = b;
	}

	public String getDisease() {
		return disease;
	}
	public void setDisease(String d) {
		disease = d;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int p) {
		price = p;
	}
	
}

public class Solution9 {

	static Medicine[] getPriceByDisease(Medicine[] m, String disease) {
		Medicine[] arr = new Medicine[0];
		for(int i=0; i<m.length; i++) {
			if(disease.equalsIgnoreCase(m[i].getDisease())) {
				arr = Arrays.copyOf(arr, arr.length+1);
				arr[arr.length-1] = m[i];
			}
		}
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j].getPrice()>arr[j+1].getPrice()) {
					Medicine temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		if(arr.length!=0) return arr;
		return null;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Medicine[] m = new Medicine[n];
		for(int i=0; i<n; i++) {
			String name = sc.next();
			String batch = sc.next();
			String disease = sc.next();
			int price = sc.nextInt();
			m[i] = new Medicine(name, batch, disease, price);
		}
		sc.nextLine();
		String userDisease = sc.next();
		Medicine[] arr = getPriceByDisease(m, userDisease);
		if(arr!=null) {
			for(Medicine i:arr) {
				System.out.println(i.getPrice());
			}
		}
		else System.out.println("No Medicine Found");
		sc.close();
	}
}


















