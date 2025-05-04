package k_exceptionHandling.CustomException;

public class InsufficientBalException extends Exception{
	public InsufficientBalException() {
		super("account consists minimum balance");
	}
}
