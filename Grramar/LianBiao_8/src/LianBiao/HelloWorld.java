package LianBiao;

public class HelloWorld
{

	public static void main(String[] args)
	{
		// 4只猴子
		Monkey m1 = new Monkey(101,"圆圆");
		Monkey m2 = new Monkey(102,"方方");
		Monkey m3 = new Monkey(103,"角角");
		Monkey m4 = new Monkey(104,"朱朱");
		
		MonkeyList monkeys = new MonkeyList();
		monkeys.add(m1);
		monkeys.add(m2);
		monkeys.add(m3);
		monkeys.add(m4);
		
		monkeys.remore(m2);
		monkeys.showALL();

	}
}
