package h_arrayConcepts;

// Print most frequently repeated element in an array
import java.util.ArrayList;
import java.util.Arrays;
public class Example17 {
	public static void main(String[] args) {
        int[] a = {7,4,7,4,7,4,7,4};
        System.out.println(Arrays.toString(a));
        boolean[] visit = new boolean[a.length];
        int maxCnt = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<a.length; i++) {
        	if(!visit[i]) {
        		int temp = a[i], cnt = 1;
        		for(int j=i+1; j<a.length; j++) {
        			if(temp==a[j]) {
        				cnt++;
        				visit[j] = true;
        			}
        		}
        		if(cnt>maxCnt) {
					maxCnt = cnt;
					res.clear();
					res.add(temp);
				}
        		else if(maxCnt==cnt) res.add(temp);
        	}
        }
        System.out.println(res+" --> "+maxCnt); 
    }
}
