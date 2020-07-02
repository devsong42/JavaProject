package af;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld
{

	public static void main(String[] args)
	{
		// 日期与时间
//		long now = System.currentTimeMillis(); // 当前时间
		Date now = new Date();
		// 格式化
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = sdf.format(now);
		System.out.println("Now: "+dateStr);

	}

}
