package af;

public class InvaildCharException extends Exception
{
	public int pos;
	public char ch;
	
	public InvaildCharException(int pos, char ch)
	{
		this.pos = pos;
		this.ch = ch;
	}

	@Override
	public String getMessage()
	{
		return "非法字符'" + ch + "',位置：" + pos;
	}

}
