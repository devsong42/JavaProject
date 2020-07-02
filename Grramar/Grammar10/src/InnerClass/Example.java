package InnerClass;

public class Example
{
	private int number = 55;
	
	// 静态内部类（不可访问当前外部对象，但仍可访问私有类型）
	public static class XXX
	{
		public void test(Example ex)
		{
			ex.number = 66;
			System.out.println("静态内部类...");
		}
	}
	
	public static void main(String args)
	{
		Example A = new Example();
		// 静态内部类可以在外部使用
		Example.XXX a = new Example.XXX();
		a.test(A);
	}

}
