package ShuZuYuDuiXiang;

public class HelloWorld
{

	public static void main(String[] args)
	{
		// 数组的建立
		int[] arr = new int[4]; //也可以直接指定，如：int[] a4 = { 5 , 4 , 7 , 6 };
		arr[0] = 5;
		arr[1] = 4;
		arr[2] = 7;
		arr[3] = 6;
		
		//数组的遍历
		for ( int i =0; i<arr.length; i++) // arr.length 是数组的长度(4)
		{
			System.out.print( arr[ i ] + " ");
		}
		System.out.print( "\n" );
		
		//求和
		int total = 0;
		for ( int i =0; i<4; i++)
		{
			total += arr[ i ];
		}
		System.out.print( total + " ");
		

	}

}
