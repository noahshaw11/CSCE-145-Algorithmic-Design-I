/*
 * Created by Noah Shaw
 */
public class TimeFormatException extends Exception {
	
	public TimeFormatException()
	{
		super("This is an incorrect time.");
	}
	public TimeFormatException(String aMsg)
	{
		super(aMsg);
	}

}
