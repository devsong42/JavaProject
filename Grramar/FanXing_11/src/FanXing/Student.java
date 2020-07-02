package FanXing;

public class Student
{
	public String name;
	public int id;
	public boolean sex;

	public Student(String name, int id, int sex)
	{
		this.name = name;
		this.id = id;
		if(sex > 0) this.sex = true;
		else this.sex = false;

	}

	public Student()
	{
		this.name = "无";
		this.id = 000;
		this.sex = true;

	}

	public void show(int form, int to)
	{
		for (int i = form; i <= to; i++)
		{
			System.out.println("报数：" + i);
		}
	}

	@Override
	public boolean equals(Object obj)
	{
		Student stu = (Student) obj;
		if(this.id == stu.id)
			return true;
		return false;
	}
	
	@Override
	public String toString()
	{
		String str;
		if(this.sex) str = "男";
		else str = "女";
		String d = "(" + id + "," + name + "," + str + ")";
		return d;

	}

}
