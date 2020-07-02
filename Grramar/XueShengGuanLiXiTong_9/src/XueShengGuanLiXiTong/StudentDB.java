package XueShengGuanLiXiTong;

import java.util.ArrayList;

/* DB
 * 用于存储记录
 * 
 */
public class StudentDB
{
	public ArrayList<Student> list = new ArrayList<>();
	
	// 添加一个对象
	public void add(Student s)
	{
		list.add(s);
	}
	
	// 按学号删除一条记录
	public void remove(int id)
	{
		for(int i = 0; i<list.size(); i++)
		{
			Student s = (Student)list.get(i);
			if(s.id == id)
			{
				list.remove(i);
				break;
			}
		}
	}
	
	// 按名称查找一个对象
	public ArrayList<Student> find(String name)
	{
		ArrayList<Student> result = new ArrayList<>();
		
		for(int i = 0; i<list.size(); i++)
		{
			Student s = (Student)list.get(i);
			if(s.name.indexOf(name) >= 0)
			{
				result.add(s);
			}
		}
		return result;
	}

}
