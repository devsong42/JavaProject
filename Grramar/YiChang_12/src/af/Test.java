package af;

public class Test
{
	public static void main(String[] args)
	{
		// 把一个字符串转成整数
		Converter conv = new Converter();
		try
		{
			int result = conv.str2int("20k20");
			System.out.println(result);
		}
		catch (Exception e)
		{
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
		finally // 总要运行
		{
			System.out.println("OK");
		}

	}

}
