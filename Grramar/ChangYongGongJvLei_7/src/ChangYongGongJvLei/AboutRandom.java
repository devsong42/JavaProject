package ChangYongGongJvLei;

import java.util.Random;

public class AboutRandom
{

	public static void main(String[] args)
	{
		// Random 随机数工具类
		int[] result = new int[3];
		int count = 0;

		Random rand = new Random();
		while (count < 3)
		{
			// 抽一个幸运员工，s 是他的号码
			int s = rand.nextInt(96);

			// 检查 s 是否已中过奖
			boolean exist = false;
			for (int i = 0; i < count; i++)
			{
				if (result[i] == s)
				{
					exist = true;
					break;
				}
			}

			if (!exist)
			{
				result[count] = s;
				count ++;
			}
		}

		for (int i = 0; i < result.length; i++)
		{
			System.out.println("恭喜第" + (result[i] + 1) + "号员工获奖！");
		}

	}

}
