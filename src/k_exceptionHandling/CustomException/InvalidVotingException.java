package k_exceptionHandling.CustomException;

// If the custom exception extends Exception called Checked Exception/Custom Exception
// Propagation is mandatory
public class InvalidVotingException extends Exception{
	public InvalidVotingException() {
		super("age is less than 18");
	}
}
