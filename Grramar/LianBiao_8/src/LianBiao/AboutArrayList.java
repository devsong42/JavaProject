package LianBiao;

import java.util.ArrayList;

public class AboutArrayList
{

	public static void main(String[] args)
	{
		// ArrayList 数组链表类
		Student s1 = new Student("小王","2020101");
		Student s2 = new Student("小张","2020102");
		Student s3 = new Student("小李","2020103");
		
		ArrayList<Student> container = new ArrayList<Student>();
		
		// 添加对象
		container.add(s1);
		container.add(s2);
		container.add(s3);
		
		// 删除对象
		container.remove( 1 );
		
		// 遍历
		for( Student s : container)
		{
			System.out.println("遍历得到：" + s);
		}
		
	}
}