package ChangYongGongJvLei;

public class AboutString
{

	public static void main(String[] args)
	{
		// 关于 String 的常见用法

		// 长度
		String s = "你好Hello";
		System.out.println(s.length()); /*
										 * 中英字符均只占1个字符 空字符串即长度为0的字符串
										 */

		// 子串
		System.out.println(s.substring(0, 4)); // 0,1,2,3，不含4

		// 截掉空白
		String a = "   Hello! OK  ";

		String A = a.trim(); // 截掉字符串左右的空白
		System.out.println(A);

		// 分割
		String b = "小张，小王，小李";

		String[] names = b.split("，"); // 将一个以 "，" 分隔的字符串分成若干个 String

		for (int i = 0; i < names.length; i++)
		{
			String name = names[i].trim();
			System.out.println(name);
		}

		// 转义字符
		System.out.println("You are a \"good\" boy"); // \" 在打印出后会被转义成 "
		System.out.println("1\n2\n3"); // 换行符 \n
		System.out.println("1\t2\t3"); // 制表符 \t
		System.out.println("1\\2\\3"); // 反斜杠 \\

		// 按字典序比较大小
		String s1 = "liming";
		String s2 = "lilei";
		int k = s1.compareTo(s2);

		if (k < 0) // 忽略大小写的比较用 compareToIgnoreCase() （大写比小写大）
		{
			System.out.println(s1 + "位于前面");
		} else
		{
			System.out.println(s2 + "位于前面");
		}

		// 格式化
		String K = String.format("姓名：%s，年龄：%d，身高：%.2f", "宋弋飞", 12, 1.55);
		System.out.println(K);

		// 查找
		String n = "China is a great country.";
		int pos = n.indexOf("great"); // 也可指定从某个位置往后查找，如：indexOf("great",5)

		if (pos < 0)
		{
			System.out.println("没找到");
		} else
		{
			System.out.println("在第" + (pos + 1) + "个字符处");
		}

		// 前缀后缀（ startsWith()：判断前缀；endsWith()：判断后缀）
		String filename = "test.mp4";

		if (filename.endsWith(".mp4"))
		{
			System.out.println("支持此视频格式！");
		} else
		{
			System.out.println("不支持此视频格式！");
		}

	}

}
