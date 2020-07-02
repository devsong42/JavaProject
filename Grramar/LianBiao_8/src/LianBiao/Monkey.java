package LianBiao;

public class Monkey
{
	public int id;			// 编号
	public String name;		// 名字
	public Monkey next;		// 它后面的猴子，null 表示后面没有猴子
	
	public Monkey(int id,String name)
	{
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "("+name+","+id+")";
	}
	
	

}
