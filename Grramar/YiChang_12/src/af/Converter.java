package af;

public class Converter
{
	// 异常机制
	// 自定义异常
	
	public int str2int(String str) throws Exception
	{
		if(str.length()>11)
		{
			Exception ex = new TooLargeException(str.length());
			throw ex;
		}
		int result = 0;
		boolean minus = false;
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch<'0'||ch>'9')
			{
				if(! (ch=='-'))
				{
					Exception ex = new InvaildCharException(i,ch);
					throw ex;
				}
			}
			if(i==0 && ch=='-')
			{
				minus = true;
			}
			else
			{
				result = result*10+(ch - '0');
			}
		}
		if(minus) result = 0 - result;
		return result;
	}

}
