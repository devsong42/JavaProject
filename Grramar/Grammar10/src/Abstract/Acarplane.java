package Abstract;

public class Acarplane extends carplane
{
	// 实现抽象类的抽象方法
	@Override
	public void run()
	{
		System.out.println("哈哈000000");
		
	}

	@Override
	public void fly()
	{
		System.out.println("飞飞->->->");
		
	}
	
	public static void main(String[] args)
	{
		Acarplane acp = new Acarplane();
		acp.fly();
		acp.run();

	}

}
