package LianBiao;

public class MonkeyList
{
	// 创建有头链表
	private Monkey head = new Monkey(0, "石猴");
	
	// 添加一个对象
	public void add(Monkey m)
	{
		if( head.next == null)
		{
			head.next = m;
		} else
		{
			Monkey tail = head.next;
			while(tail.next != null)
			{
				tail = tail.next;
			}
			tail.next = m;
		}
	}
	
	// 按编号（名字）查询
	public Monkey get( int id)
	{
		Monkey m = head.next;
		while( m != null)
		{
			if( m.id == id)
			{
				return m;
			}
			m = m.next;
		}
		return null;
	}
	
	public Monkey get( String name)
	{
		Monkey m = head.next;
		while( m != null)
		{
			if( m.name == name)
			{
				return m;
			}
			m = m.next;
		}
		return null;
	}
	
	// 删除一个对象
	public void remore (Monkey m)
	{
		Monkey node = head;
		while( node.next != null)
		{
			if(node.next == m)
			{
				node.next = node.next.next;
				break;
			}
			node = node.next;
		}
	}
	
	// 遍历
	public void showALL()
	{
		Monkey node = head.next;
		while( node != null)
		{
			System.out.println("链表中的节点："+node);
			node = node.next;
		}
		
		System.out.println("exit.");
	}

}
