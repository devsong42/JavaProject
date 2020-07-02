package ChangYongGongJvLei;

public class AboutCharacter
{

	public static void main(String[] args)
	{
		// char (Character) 字符类
		// String => char
		String str = "afeinihao阿飞你好";
		char ch = str.charAt(9);
		char[] chs = str.toCharArray();
		System.out.println(ch+"\nOK");
		
		// char => String
		String str1 = new String(chs,1,4);
		str1 += '的';
		System.out.println(str1+"\nOK");

	}

}
