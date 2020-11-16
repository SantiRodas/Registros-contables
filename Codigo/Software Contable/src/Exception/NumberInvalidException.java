package Exception;

@SuppressWarnings("serial")
public class NumberInvalidException extends Exception {

	public NumberInvalidException() {

	}
	
	@Override
	public String getMessage() {
		return "the information is invalid";
	}
	
}
