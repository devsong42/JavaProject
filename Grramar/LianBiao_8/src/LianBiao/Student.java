package LianBiao;

public class Student
{
	private String name;
	private String id;

	public Student(String name, String id)
	{
		this.name = name;
		this.id = id;

	}

	public Student()
	{
		this.name = "无";
		this.id = "000";

	}

	public void show(int form, int to)
	{
		for (int i = form; i <= to; i++)
		{
			System.out.println("报数：" + i);
		}
	}

	@Override
	public String toString()
	{
		String d = "(" + id + "," + name + ")";
		return d;

	}

}
