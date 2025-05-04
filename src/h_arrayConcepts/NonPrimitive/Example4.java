package h_arrayConcepts.NonPrimitive;

// Abstract type Array
abstract class Anime{
	abstract void watch();
}
class MHA extends Anime{
	@Override
	void watch() {
		System.out.println("My Hero Academia");
	}
}
class JK extends Anime{
	@Override
	void watch() {
		System.out.println("Jujutsu Kaisen");
	}
}
class DS extends Anime{
	@Override
	void watch() {
		System.out.println("Demon Slayer");
	}
}
public class Example4 {

	public static void main(String[] args) {
		Anime[] a = new Anime[3];
		a[0] = new MHA();
		a[1] = new JK();
		a[2] = new DS();
		
		for(Anime n:a) n.watch();
	}

}
