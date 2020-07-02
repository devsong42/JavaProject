package Lei;

public class Student
{
	//类的属性
	private String name;  //public表示外部可用，private表示外部不可用
	public String getName() //getter 外部可以使用此方法查看私有属性 (get + 属性名(首字母大写))
	{
		return name;
	}

	public void setName(String name) //setter 外部可以使用此方法查看私有属性 (set + 属性名(首字母大写))
	{
		this.name = name;
	}

	public String id;
	public boolean sex = true;
	public String birthday = "0000-00-00";
	
	//构造方法
	public Student (String name,String id,boolean sex ,String birthday)
	{
		this.name=name;
		this.id=id;
		this.sex=sex;
		this.birthday=birthday;
	}
	public Student ()
	{
		this.name="无";
		this.id="000";
		this.sex=true;
	}
	
	//类的方法
	public void show( int form, int to) //设定参数
	{
		for ( int i = form; i<=to; i++)
		{
			System.out.println("报数："+i);
		}
	}

	@Override
	public String toString()
	{
		String d ="学号:"+id+",姓名:"+name;
		if(sex)
		{
			d=d+"(男)";
		}
		else
		{
			d=d+"(女)";
		}
		d=d+",生日:"+birthday;
		return d;

	}
	
	

}
