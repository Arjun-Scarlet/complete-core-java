package z_Java_Problems.p1ArraysProblem;

/*
Find the array has increasing triplet subsequence or not
Condition: i<j<k and a[i]<a[j]<a[k]
Input: arr = [1,2,3,4,5]
Output: true

Input: nums = [5,4,3,2,1]
Output: false

Input: nums = [2,1,5,0,4,6]
Output: true
*/
public class Test4 {

	public static void main(String[] args) {
		int[] a = {2,1,5,0,-1,-6};
		int n1 = Integer.MAX_VALUE;//assigns maximum integer value
		int n2 = Integer.MAX_VALUE;
		boolean flag = false;
		
		for(int num: a) {
			if(num<=n1) n1 = num;
			else if(num<=n2) n2 = num;
			else flag = true;
		}
		
		if(flag) System.out.println("Triplet Array");
		else System.out.println("Not a Triplet Array");
	}
}
