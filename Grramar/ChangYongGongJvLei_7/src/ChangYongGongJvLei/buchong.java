package ChangYongGongJvLei;

public class buchong
{

	public static void main(String[] args)
	{
		// 条件表达式
		int a = 12;
		int b = 10;
		int max = ( a > b ) ? a : b; /*  C ? E1 : E2
		  							  *  表示：当 C 成立时，结果为 E1 ，否则为 E2 */
		System.out.println(max);
		
		// 数组遍历的简写
		String[] names = {
				"song","zhang","cheng"
		};
		
		for( String name : names)
			System.out.println("name:" + name);

	}

}
