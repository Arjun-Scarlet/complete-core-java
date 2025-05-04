package j_collectionFramework.List;
// List can be created by using Arrays.asList()
// It only takes Homogeneous type data with fixed size

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class Example2 {
	
	public static void main(String[] args) {
		List<Integer> a1 = Arrays.asList(10,50,15,40,30);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
	}
}
