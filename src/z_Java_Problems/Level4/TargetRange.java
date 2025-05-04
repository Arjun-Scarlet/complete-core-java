package z_Java_Problems.Level4;

// Print range of an array for target
// Input: [2,4,8,9,7,5] target = 21
// Output: Range index: 1 to 3 (because 4+8+9=21)
public class TargetRange {
	public static void range(int[] a, int target) {
        int start = 0, sum = 0;
        for(int i=0; i<a.length; i++) {
            sum += a[i];
            
            while (sum>target && start<=i) {
                sum -= a[start];
                start++;
            }
            
            if (sum==target) {
                System.out.println("Range index: " + start + " to " + i);
                return;
            }
        }
        
        System.out.println("Target Range not Found!");
    }
	
    public static void main(String[] args) {
        int[] a = {2,4,8,9,7,5};
        int target = 21;
      
        range(a, target);
    }
}
