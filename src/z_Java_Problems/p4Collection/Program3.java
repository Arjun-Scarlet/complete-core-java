package z_Java_Problems.p4Collection;

// Given a string s, the task is to check if it is Pangram or not.
//A pangram is a sentence containing all letters of the English Alphabet.
import java.util.HashSet;
import java.util.Set;

public class Program3 {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog";
		Set<Character> h = new HashSet<Character>();
		for(char ch: s.toLowerCase().toCharArray()) {
			if(Character.isAlphabetic(ch)) h.add(ch);
		}
//		System.out.println(h);
		System.out.println("String is "+(h.size()==26?"Panagram":"Not a Panagram"));
    }
}
