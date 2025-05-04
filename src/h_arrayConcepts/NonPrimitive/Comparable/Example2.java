package h_arrayConcepts.NonPrimitive.Comparable;

class Note implements Comparable{
	int pages;
	Note(int p){
		pages = p;
	}
	@Override
	public int compareTo(Object o) {
		return pages-((Note)o).pages;
	}
	@Override
	public String toString() {
		return "Note[Pages: "+pages+"]";
	}
}
public class Example2 {
	public static void main(String[] args) {
		Note[] a = new Note[4];
		a[0] = new Note(150);
		a[1] = new Note(200);
		a[2] = new Note(200);
		a[3] = new Note(170);
		
		for(int i=0; i<a.length-1; i++) {
			System.out.println(a[i].compareTo(a[i+1]));
		}
	}
}
