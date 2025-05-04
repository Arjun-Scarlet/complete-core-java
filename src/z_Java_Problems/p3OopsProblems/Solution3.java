package z_Java_Problems.p3OopsProblems;

/*
Input:
5
101
Agatha Christie
11
Murder on the Orient Express
Crime
20
102
Arthur Conan Doyle
12
The Hound of the Baskervilles
Crime
25
103
Stephen Edwin King
13
A Memoir of the Craft
Horror
40
104
Clayton Emery
14
The Burning Goddess
Fantasy
30
105
Trisha Ashley
15
Wedding Tiers
Fantasy
35
Crime
Fantasy
20

Output:
AuthorName: Agatha Christie, Title: Murder on the Orient Express
AuthorName: Arthur Conan Doyle, Title: The Hound of the Baskervilles
Discounted Fantasy Books:
AuthorName: Clayton Emery, Title: The Burning Goddess, Updated Price: 24.0
AuthorName: Trisha Ashley, Title: Wedding Tiers, Updated Price: 28.0
*/

import java.util.*;

class Author {
	int aId;
	String aName;
	Author(int id, String name){
		aId = id;
		aName = name;
	}
	@Override
	public String toString() {
		return "Author[Id=" + aId + ", Name=" + aName + "]";
	}
}

class Book {
	int bId;
	String title;
	String genre;
	double price;
	Author author;
	public Book(int bId, String title, String genre, double price, Author author) {
		this.bId = bId;
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book[Id: "+bId+", Title: "+title+", Genre: "+genre+", Price: "+price+", "+author+"]";
	}
}

public class Solution3 {
	
	static List<Book> getBooksBelongingToGenre(List<Book> l, String genre){
		List<Book> list = new ArrayList<Book>();
		for(int i=0; i<l.size(); i++) {
			String s = l.get(i).genre;
			if(s.equalsIgnoreCase(genre)) list.add(l.get(i));
		}
		return list;
	}
	
	static List<Book> calculateDiscountPrice(List<Book> l, String genre, int disPer){
		List<Book> list = new ArrayList<Book>();
		for(int i=0; i<l.size(); i++) {
			String s = l.get(i).genre;
			if(s.equalsIgnoreCase(genre)) {
				double disc = l.get(i).price-((l.get(i).price*disPer)/100);
				l.get(i).price = disc;
				list.add(l.get(i));
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Book> l = new ArrayList<Book>();
		for(int i=0; i<n; i++) {
			int aId = sc.nextInt();
			sc.nextLine();
			String aName = sc.nextLine();
			int bId = sc.nextInt();
			sc.nextLine();
			String title = sc.nextLine();
			String genre = sc.next();
			double price = sc.nextDouble();
			sc.nextLine();
			Book b = new Book(bId, title, genre, price, new Author(aId, aName));
			l.add(b);
		}
		
		String inpGenre = sc.next();
		String inpGenre2 = sc.next();
		int disPer = sc.nextInt();
		
		List<Book> res = getBooksBelongingToGenre(l, inpGenre);
		if(res.isEmpty())
			System.out.println("Genre is not available in the list!");
		else {
			for(int i=0; i<res.size(); i++) {
				System.out.print("AuthorName: "+res.get(i).author.aName+", Title: "+res.get(i).title+"\n");
			}
		}
		
		List<Book> res1 = calculateDiscountPrice(l, inpGenre2, disPer);
		System.out.println("Discounted "+inpGenre2+" Books:");
		if(res1.isEmpty())
			System.out.println("Discount books are unavailable in the given genre!");
		else {
			for(int i=0; i<res1.size(); i++) {
				System.out.print("AuthorName: "+res1.get(i).author.aName+", Title: "+res1.get(i).title+", Updated Price: "+res1.get(i).price+"\n");
			}
		}
		sc.close();
	}

}
















