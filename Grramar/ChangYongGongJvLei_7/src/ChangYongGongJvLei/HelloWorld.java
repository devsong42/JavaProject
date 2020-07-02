package ChangYongGongJvLei;

public class HelloWorld
{

	//AfConsole 控制台输入工具类
	public static void main(String[] args)
	{
		AfConsole c = new AfConsole();

		c.print("请输入用户名：");
		String username = c.readString("guest");
		
		c.print("请输入密码：");
		String password = c.readString("");
		
		for(int i = 2;;i--)
		{	
			if(password.equals(""))
			{
				c.println("请输入密码！");
				c.print("请重新输入：");
				password = c.readString("");
				i++;
			}
			else if(password.equals("852046"))
			{
				c.println(username + "，欢迎进入程序！");
				c.println(". " + ".. " + "...");
				c.print("很抱歉，程序正在修复中，退出程序 " + ".. " + "...");
				break;
			}
			else if (i <= 0)
			{
				c.print("次数已用完，退出程序");
				break;
			}
			else
			{
				c.println("密码错误！剩余" + i +"次机会。" );
				c.print("请重新输入：");
				password = c.readString("");
			}
		}
	}

}
