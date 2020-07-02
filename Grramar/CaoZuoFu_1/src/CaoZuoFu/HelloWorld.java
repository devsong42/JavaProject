package CaoZuoFu;

public class HelloWorld
{

	public static void main(String[] args)
	{
		// 以下为算术操作符知识( + - * / % )
		System.out.println("结果为: " + (14 / 5));
		// 或者如下
		int result = 14 / 5;
		System.out.println("结果为: " + result); // 结果2
		System.out.println("结果为: " + (14 % 5)); // 结果 4
		System.out.println("结果为: " + (3 % 5)); // 结果 3
		System.out.println("结果为: " + (14.0 / 5.0)); // 结果2.8
		System.out.println("结果为: " + (14.0 % 5.0)); // 结果4.0
		System.out.println("       ");

		// 以下为关系操作符知识( > < >= <= != )
		int a = 10;
		int b = 4;
		System.out.println(" 结果: " + (a > b)); // 结果true
		System.out.println(" 结果: " + (a < b)); // 结果false
		System.out.println(" 结果: " + (a >= b)); // 结果true
		System.out.println(" 结果: " + (a <= b)); // 结果false
		System.out.println(" 结果: " + (a != b)); // 结果true
		System.out.println("       ");

		// 以下为逻辑操作符知识( && || ! )
		boolean c = true;
		boolean d = false;
		System.out.println("结果: " + (c && d)); // && 表示"并且",只有c和d同时成立的时候结果才为true
		boolean n = true;
		boolean m = false;
		System.out.println("结果: " + (n || m)); // || 表示"或者",只要n,m有一个成立结果即为为true
		boolean k = true;
		System.out.println("结果: " + (!k)); // ! 表示"非",因为k为true,所以 !k 就是 false
		System.out.println("       ");

		// 以下为赋值操作符知识( = += -= *= /= %= )
		int a1 = 10;
		a1 += 12;
		System.out.println("现在a1的值为: " + a1);// a1 += 12 相当于 a = a + 12
		System.out.println("       ");

		// 以下为自增/自减操作符知识( ++ / -- )
		// ++ 用于给变量加1，-- 则相反
		int a2 = 0;
		int b2 = 10;
		a2 = b2++; // 相当于 a2 = b2 , b2 ++
		System.out.println("现在a2的值为: " + a2 + "，现在b2的值为: " + b2);
		a2 = --b2; // 相当于 b2 -- , a2 = b2
		System.out.println("现在a2的值为: " + a2 + "，现在b2的值为: " + b2);
		System.out.println("       ");
		
		//以下为类型转换知识
		double a3 = 27.66;
		int b3 = (int) a3; //后面的小数是直接截断,不存在四舍五入
		System.out.println("b3=" + b3);

	}

}
