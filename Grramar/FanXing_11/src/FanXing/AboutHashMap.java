package FanXing;

import java.util.HashMap;

public class AboutHashMap
{

	public static void main(String[] args)
	{
		// HashMap 哈希映射，常见泛型
		HashMap<Integer,Student> map = new HashMap<>(); // 以 <key,value> 格式存储
		map.put(2020001, new Student("小张",2020001,1));
		map.put(2020002, new Student("小红",2020002,0));
		map.put(2020003, new Student("小李",2020003,1));
		map.put(2020004, new Student("小雪",2020004,0));
		
		// 用 key 查找一个对象
		Student s = map.get(2020003); // 如果查到了，则返回对应的 Value,否则返回 null
		System.out.println(s);

	}

}
