package h_arrayConcepts.NonPrimitive;

// Object type Array
class Book{
	int pages;
	Book(int p){
		pages = p;
	}
	@Override
	public String toString() {
		return "Book[Pages: "+pages+"]";
	}
}
public class Example2 {

	public static void main(String[] args) {
		Book[] a = new Book[3];
		a[0] = new Book(105);
		a[1] = new Book(150);
		a[2] = new Book(115);
		for(Book b:a) System.out.println(b);
	}

}
