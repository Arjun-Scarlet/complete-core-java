package a_interview;

import java.util.Arrays;

public class Program2 {

	public static void main(String[] args) {
		int[] a = {9,17,8,40,11,18,10,1,9,70,101,7,14,20};
		int[] res = Arrays.stream(a).distinct().toArray();
		System.out.println(Arrays.toString(res));
	}
}
