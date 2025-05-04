package z_Java_Problems.p3OopsProblems;

/*
Input:
4
1
100
50
50
2
200
60
40
3
150
35
45
4
80
45
40
45

Output:
1 Non-Critical Filling
3 Non-Critical Filling

*/

import java.util.*;
class Inventory {
	private int inventoryId;
	private int maximumQuantity;
	private int currentQuantity;
	private int threshold;
	
	Inventory(int id, int max, int current, int th){
		inventoryId = id;
		maximumQuantity = max;
		currentQuantity = current;
		threshold = th;
	}

	public int getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(int id) {
		inventoryId = id;
	}

	public int getMaximumQuantity() {
		return maximumQuantity;
	}
	public void setMaximumQuantity(int max) {
		maximumQuantity = max;
	}

	public int getCurrentQuantity() {
		return currentQuantity;
	}
	public void setCurrentQuantity(int current) {
		currentQuantity = current;
	}

	public int getThreshold() {
		return threshold;
	}
	public void setThreshold(int th) {
		threshold = th;
	}	
	
}

public class Solution7 {

	static Inventory[] replenish(Inventory[] a, int limit) {
		Inventory[] arr = new Inventory[0];
		for(int i=0; i<a.length; i++) {
			if(limit <= a[i].getThreshold()) {
				arr = Arrays.copyOf(arr, arr.length+1);
				arr[arr.length-1] = a[i];
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Inventory[] a = new Inventory[n];
		for(int i=0; i<n; i++) {
			int id = sc.nextInt();
			int max = sc.nextInt();
			int current = sc.nextInt();
			int th = sc.nextInt();
			a[i] = new Inventory(id, max, current, th);
		}
		int limit = sc.nextInt();
		Inventory[] arr = replenish(a, limit);
		
		for(int i=0; i<arr.length; i++) {
			int thr = arr[i].getThreshold();
			if(thr>75) System.out.println(arr[i].getInventoryId()+" Critical Filling");
			else if(thr<75 && thr>50) System.out.println(arr[i].getInventoryId()+" Moderate Filling");
			else System.out.println(arr[i].getInventoryId()+" Non-Critical Filling");
		}
		sc.close();
	}
}



















