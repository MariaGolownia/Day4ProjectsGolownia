package by.javatr.task1.exc;

public class ValidationFileException extends Exception {


	private static final long serialVersionUID = -3863315759696489805L;

	public ValidationFileException (String message) {
		super(message);
	}
	
	@Override
    public String toString() {
		return "ValidationException{"
                + ", message=" + getMessage()
                + "} ";
	}
	
}

