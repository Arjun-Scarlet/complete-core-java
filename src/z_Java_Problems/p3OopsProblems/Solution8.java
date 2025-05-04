package z_Java_Problems.p3OopsProblems;

/*
Input:
4
Spiderman No Way Home
Marvel
Action
250000000
Avengers Endgame
Marvel
Action
300000000
Deadpool and Wolverine
Marvel
Comedy
25000000
Antman and Wasp
Marvel
Comedy
2000000
Action

Output:
High Budget Movie
High Budget Movie
 
*/

import java.util.*;
class Movie {
	private String movieName;
	private String company;
	private String genre;
	private int budget;
	
	Movie(String n, String c, String g, int b){
		movieName = n;
		company = c;
		genre = g;
		budget = b;
	}

	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String n) {
		movieName = n;
	}

	public String getCompany() {
		return company;
	}
	public void setCompany(String c) {
		company = c;
	}

	public String getGenre() {
		return genre;
	}
	public void setGenre(String g) {
		genre = g;
	}

	public int getBudget() {
		return budget;
	}
	public void setBudget(int b) {
		budget = b;
	}
	
}

public class Solution8 {

	static Movie[] getMovieByGenre(Movie[] m, String genre) {
		Movie[] arr = new Movie[0];
		for(int i=0; i<m.length; i++) {
			if(genre.equalsIgnoreCase(m[i].getGenre())) {
				arr = Arrays.copyOf(arr, arr.length+1);
				arr[arr.length-1] = m[i];
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Movie[] m = new Movie[n];
		for(int i=0; i<n; i++) {
			String name = sc.nextLine();
			sc.nextLine();
			String company = sc.next();
			String genre = sc.next();
			int budget = sc.nextInt();
			m[i] = new Movie(name, company, genre, budget);
		}
		sc.nextLine();
		String userGenre = sc.next();
		Movie[] arr = getMovieByGenre(m, userGenre);
		for(int i=0; i<arr.length; i++) {
			int temp = arr[i].getBudget();
			if(temp>80000000) System.out.println("High Budget Movie");
			else System.out.println("Low Budget Movie");
		}
		sc.close();
	}
}






















