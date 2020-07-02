package af;

public class TooLargeException extends Exception
{
	public int length;
	
	public TooLargeException(int length)
	{
		this.length = length;
	}

	@Override
	public String getMessage()
	{
		return "字符串太长（" + length + "）";
	}
	

}
