package z_Java_Problems.Level4;

public class StringMaxOcc {

	public static void main(String[] args) {
		String s = "aaabbbccaddbb";
		char[] a = s.toCharArray();
		int max = 1;
		char ele = a[0];
		for(int i=0; i<a.length; i++) {
			int cnt = 0; char ch = a[i];
			for(int j=0; j<a.length; j++) {
				if(ch==a[j]) cnt++;
			}
			if(cnt>max) {
				max = cnt; 
				ele = a[i];
			}
		}
		System.out.println(ele+" -> "+max);
	}
}
