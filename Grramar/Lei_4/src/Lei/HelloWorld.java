package Lei;

public class HelloWorld
{

	public static void main(String[] args)
	{
		Student s1 = new Student("宋弋飞","666",true,"2008-04-02"); //设置属性
//		s1.setName("宋弋飞"); 
//		s1.id = "666";
//		s1.sex = true;
//		s1.birthday ="2008-04-02";
		
		Student s2 = new Student("褚凌宇","666666",true,"2004-11-04");
//		s2.setName("褚凌宇");
//		s2.id = "666666";
//		s2.sex = true;
//		s2.birthday ="2004-11-04";
		
		Student s3 = new Student("宋与悦","6666",false,"2004-01-17");
//		s3.setName("宋与悦");
//		s3.id = "6666";
//		s3.sex = false;
//		s3.birthday ="2004-01-17";
		
		s1.show(1,2); //调用方法
		System.out.println("学生信息: "+s1);
		System.out.println("学生信息: "+s2);
		System.out.println("学生信息: "+s3);
		
		//求一个数组的总和是否大于100
		int[] arr = {56,9,12};
		MyMath a = new MyMath();
		boolean result =a.cheak(arr);
		System.out.println(result);
		
		//打印输出从m到n之间的所有质数
		MyMath a1 = new MyMath();
		a1.shuchu(6, 50);

	}

}
