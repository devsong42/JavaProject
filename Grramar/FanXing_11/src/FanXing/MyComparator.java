package FanXing;

import java.util.Comparator;

public class MyComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2)
	{
		// 按学号比大小
		if(o1.id < o2.id) return -1;
		if(o1.id > o2.id) return 1;
		return 0;
	}

}
