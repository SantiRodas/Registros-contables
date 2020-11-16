package Exception;

@SuppressWarnings("serial")
public class InformationInsufficientException extends Exception {

	public InformationInsufficientException() {
	}
	
	@Override
	public String getMessage() {
		return "insufficient information ";
	}
	
}
