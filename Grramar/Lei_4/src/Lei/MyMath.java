package Lei;

public class MyMath
{
	//求一个数组的总和是否大于100
	public boolean cheak( int[]arr)
	{
		int sum = 0;
		for (int i=0;i<arr.length;i++)
		{
			sum += arr[i];
			if(sum>100)
			{
				return true;
			}
		}
		return false;
	}
	
	//判断是否为质数
	private boolean panduan(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	//打印输出从m到n之间的所有质数
	public void shuchu(int m,int n)
	{
		for(int i=m;i <= n;i++)
		{
			if(this.panduan(i)) //this 表示当前对象
			{
				System.out.println(i+"是质数");
			}
		}
	}

}
