package h_arrayConcepts.NonPrimitive.Comparable;

// Comparable is an interface used to compare 2 object properties one at a time
// It is a native party class which helps to compare objects
// By using Comapartor's compare() we can customize the Arrays.sort() implementation

class Comics implements Comparable{
	int pages;
	Comics(int p){
		pages = p;
	}
	@Override
	public int compareTo(Object o) {
		Comics c = (Comics)o;
		if(pages>c.pages) return 1;
		if(pages<c.pages) return -1;
		return 0;
	}
	@Override
	public String toString() {
		return "Comics[Pages: "+pages+"]";
	}
}
public class Example1 {

	public static void main(String[] args) {
		Comics c1 = new Comics(100);
		Comics c2 = new Comics(80);
		System.out.println("Normal Comparison:\n"+c1.compareTo(c2));
		
		Comics[] a = new Comics[4];
		a[0] = new Comics(15);
		a[1] = new Comics(20);
		a[2] = new Comics(20);
		a[3] = new Comics(17);
		System.out.println("Array Comparison:");
		for(int i=0; i<a.length-1; i++) {
			System.out.println(a[i].compareTo(a[i+1]));
		}
	}

}