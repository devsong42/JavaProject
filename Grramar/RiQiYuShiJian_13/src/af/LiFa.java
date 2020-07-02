package af;

import java.util.Calendar;
import java.util.Date;

import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

public class LiFa
{

	public static void main(String[] args)
	{
		// 历法计算
		Calendar cal = Calendar.getInstance();

		// YEAR : 年份
		int year = cal.get(Calendar.YEAR);

		// MONTH : 月份（0-11）
		int month = cal.get(Calendar.MONTH);

		// DAY_OF_MONTH : 本月第几天（1-31）
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

		// HOUR_OF_DAY : 小时，24小时制（0-23）
		int hour = cal.get(Calendar.HOUR_OF_DAY);

		// MINUTE : 分钟（0-59）
		int minute = cal.get(Calendar.MINUTE);

		// SECOND : 秒钟（0-59）
		int second = cal.get(Calendar.SECOND);

		// DAY_OF_WEEK : 周几（1-7）（日-六）
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

		// DAY_OF_YEAR : 当年第几天（1-366）
		int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);

		// 设置年月日
		cal.set(year, month, dayOfMonth);

		// 设置年月日时分秒
		cal.set(year, month, dayOfMonth, hour, minute, second);

		// 只设置某个信息
		cal.set(Calendar.YEAR, 2020);

		// 推算
		// 90天之前
		cal.add(Calendar.DAY_OF_MONTH, -90);
		// 90天之后
		cal.add(Calendar.DAY_OF_MONTH, 90);

		// 与时间值的转换
		// Calendar => Date,long
		Date date = cal.getTime();
		long timeValue = cal.getTimeInMillis();
		System.out.print(timeValue + ", " + date);
		// Date,long => Calendar
		cal.setTime(date);
		cal.setTimeInMillis(timeValue);

		// 差值计算
		Calendar a = Calendar.getInstance();
		a.set(2020, 0, 5);
		Calendar b = Calendar.getInstance();
		b.set(2020, 3, 5);
		long TimeValue = b.getTimeInMillis() - a.getTimeInMillis();
		long days = TimeValue / (1000 * 3600 * 24);
		System.out.println(days);
		
		// 计算2020年的父亲节
		cal.set(2020, Calendar.JUNE, 1); // 从2020-6-1推算
		int numWeek = 0;
		for(int i = 0; i < 31; i++)
		{
			dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			if(dayOfWeek == Calendar.SUNDAY)
			{
				numWeek ++;
				if(numWeek == 3) // 第三个周日
				{
					System.out.printf("2020年父亲节：2020-6-%d\n", i+1);
					break;
				}
			}
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}

	}

}
