package n_Java_8_Features.LambdaExpression;

// Lambda expression in Runnable interface
public class Test5 {

	public static void main(String[] args) {
		Runnable r1 = () -> {
			for(int i=1; i<=5; i++) {
				System.out.println("inner thread: "+i);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		for(int i=1; i<=5; i++) {
			System.out.println("main thread: "+i);
		}
	}
}
