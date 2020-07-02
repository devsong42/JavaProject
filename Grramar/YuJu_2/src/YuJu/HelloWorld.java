package YuJu;

public class HelloWorld
{

	public static void main(String[] args)
	{
		//规定自行车禁止12岁以下的儿童骑行（ if 语句 ）
		int age = 11;
		
		if ( age < 12 )
		{
			System.out.println("未满12周岁，不能骑自行车！");
		}
		else
		{
			System.out.println("恭喜你，可以骑自行车了！");
		}
		System.out.println( "done." );
		
		//列出100以内能被3整除的数（ for 语句 ）
		for ( int i = 1; i <= 100; i ++ )
		{
			if ( i % 3 == 0) 
			{
				System.out.print("Got:" + i + " ");
			}
		}
		System.out.print("\n");
		System.out.println( "done." );
		
		// for 语句嵌套
		int N = 12;
		for ( int i = 0; i < N; i ++)
		{
			for ( int k = 0; k <= i; k ++)
			{
				System.out.print( "*" );
			}
			System.out.print("\n");
		}
		System.out.println( "done." );
		
		// while 语句
		int i = 1;
		while ( i<=10 )
		{
			System.out.println( i );
			i++;
		}
		System.out.println( "done." );
		
		// break continue 语句
		int I = 1;
		while ( true )
		{
			System.out.println( I );
			I++;
			if ( I >= 10)
			{
				break; //终止当前循环
			}
		}
		System.out.println( "done." );
		
		for ( int o = 1; o <= 20; o++)
		{
			if ( o%4 == 0)
			{
				continue; //跳过当前循环
			}
			System.out.print( o + " ");
		}
		System.out.println( "done." );

	}

}
