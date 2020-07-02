package JiCheng;

public class HelloWorld
{
	public static void main(String[] args)
	{
		MyVideoFile s = new MyVideoFile();
		s.size = 5465482;
		s.name = "abc.mp4";
		s.duration = 123;
		s.info();
		
		Student d = new Student();
		d.id="123";
		d.name="宋弋飞";
		d.sex=true;
		System.out.println("学生信息: "+d);
	}

}
