package JiCheng;

public class Student
{
	public String name;
	public String id;
	public boolean sex =true;
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
		return d;
	}
	
	

}
