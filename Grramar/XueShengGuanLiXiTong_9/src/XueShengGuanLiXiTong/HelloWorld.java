package XueShengGuanLiXiTong;

import java.util.ArrayList;

import af.AfConsole;

public class HelloWorld
{

	public Student getStudent(AfConsole cons)
	{
		Student stu = new Student();
		
		cons.print("学号：");
		stu.id = cons.readInt(0);
		
		cons.print("姓名：");
		stu.name = cons.readString("");
		
		cons.print("性别(1/0)：");
		int nValue = cons.readInt(1);
		stu.sex = nValue > 0;
		
		cons.print("手机号：");
		stu.cellphone = cons.readString("");
		
		return stu;
	}
	
	public void start()
	{
		AfConsole cons = new AfConsole();
		StudentDB db = new StudentDB();
		cons.println("** 学生管理系统 **");
		
		while( true )
		{
			cons.print("\n> ");
			String cmd = cons.readString("");
			cmd = cmd.trim();
			
			if(cmd.equals("exit"))
			{
				System.out.println("退出...");
				break;
			}
			else if(cmd.equals("add"))
			{
				Student stu = getStudent(cons);
				System.out.println("\n添加了：" + stu);
				
				db.add(stu);
				System.out.println("共" + db.list.size() + " 条记录");
			}
			else if(cmd.equals("show"))
			{
				System.out.println("共" + db.list.size() + " 条记录");
				for( int i = 0 ; i<db.list.size();i++)
				{
					Student stu = (Student) db.list.get(i);
					System.out.println(stu);
				}
			}
			else if(cmd.equals("remove"))
			{
				cons.print("输入要删除的学号:");
				int id = cons.readInt(0);
				if(id > 0)
				{
					db.remove(id);
					System.out.println("已删除学生：ID=" + id);
				}
			}
			else if(cmd.equals("find"))
			{
				cons.print("输入要查找的姓名:");
				String name = cons.readString("");
				name = name.trim();
				
				ArrayList<Student> result= db.find(name);
				System.out.println("匹配到" + result.size() + " 条记录");
				for(int i = 0; i<result.size(); i++)
				{
					Student stu = (Student) result.get(i);
					System.out.println(stu);
				}
			}
			else
			{
				System.out.println("错误的命令！");
			}
		}
	}
	public static void main(String[] args)
	{
		HelloWorld world = new HelloWorld();
		world.start();
		
		System.out.println("Exit");
	}

}
