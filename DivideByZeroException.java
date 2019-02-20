//Part 1. Creating exception
public class DivideByZeroException extends Exception {
	public DivideByZeroException()
	{
		super("Divide by Zero Exception"); //Put a message
	}
	public DivideByZeroException(String msg)
	{
		super(msg);
	}

}
