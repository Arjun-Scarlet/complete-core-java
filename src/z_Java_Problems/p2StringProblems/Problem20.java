package z_Java_Problems.p2StringProblems;

// Finding the string is panagram or not by removing duplicates method
import java.util.Arrays;

public class Problem20 {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		char[] a = s.toLowerCase().toCharArray();
		char max = '*';
		int cnt = 0;
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					cnt++;
					a[i] = max;
				}
			}
		}
		
		int j = 0;
		char[] ch = new char[a.length-cnt-1];
		for(char i:a) {
			if(i!=max && i!=' ') ch[j++] = i;
		}
		System.out.println("Without Duplicates:");
		System.out.println(Arrays.toString(ch));
		System.out.println("String is "+(ch.length==26?"Panagram":"not a Panagram"));
    }
}
