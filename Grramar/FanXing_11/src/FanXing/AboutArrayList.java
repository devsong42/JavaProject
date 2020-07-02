package FanXing;

import java.util.ArrayList;
import java.util.Iterator;

public class AboutArrayList
{

	public static void main(String[] args)
	{
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("小张",2020003,1));
		list.add(new Student("小红",2020002,0));
		list.add(new Student("小李",2020003,1));
		list.add(new Student("小雪",2020004,0));
		
		// 排列
		list.sort(new MyComparator());
		
		// 迭代器遍历
		Iterator<Student> iter = list.iterator();
		while( iter.hasNext())
		{
			Student s = iter.next();
			System.out.println(s);
		}

	}

}
