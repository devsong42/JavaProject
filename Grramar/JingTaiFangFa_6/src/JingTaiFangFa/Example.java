package JingTaiFangFa;

public class Example
{
	// 判断n是否为质数; true,是质数; false, 不是质数
	public static boolean isPrime(int n)
	{
		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
