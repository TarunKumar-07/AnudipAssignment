package mailException;
// creating InvalidMailException class that extends Exception class
public class InvalidMailException extends Exception{

	public InvalidMailException(String msg) {
		super(msg);	// passing msg variable to super class constructor(Exception Class)
	}
	
}
