package Exception;

@SuppressWarnings("serial")
public class ExistingInformationException extends Exception {
	
	public ExistingInformationException() {
	}
	
	@Override
	public String getMessage() {
		return "alredy existing information ";
	}
	
}
