package by.javatr.task1.exc;

public class ExceptionNotIntNumber extends Exception {

	private static final long serialVersionUID = -4011062458967691982L;

	public ExceptionNotIntNumber (String message) {
		super(message);
	}
	
	@Override
    public String toString() {
		return "ExceptionNotIntNumber{"
                + ", message=" + getMessage()
                + "} ";
	}
}
