package XueShengGuanLiXiTong;

public class Student
{
	public int id;
	public String name;
	public boolean sex;
	public String cellphone;
	
	public Student()
	{
		
	}
	
	public Student(int id, String name, boolean sex, String cellphone)
	{
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.cellphone = cellphone;
	}

	@Override
	public String toString()
	{
		String strSex = "男";
		if(sex == false)
		{
			strSex = "女";
		}
		return id + ", " + name + ", " + strSex + ", " + cellphone;
	}
	
	

}
