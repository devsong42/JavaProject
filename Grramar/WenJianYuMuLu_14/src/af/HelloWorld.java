package af;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

public class HelloWorld
{

	public static void main(String[] args)
	{
		// java.io.File 类用于表示一个文件或目录的路径
		File dir = new File("C:\\Users");
		File textFile = new File("C:\\Users\\Administrator\\Pictures\\静物面包.psd");

		if (textFile.exists()) // 判断一个文件或目录是否存在
		{
			long size = textFile.length(); // 文件的大小（字节）
			long lastModified = textFile.lastModified(); // 文件的最后修改时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String timeStr = sdf.format(new Date(lastModified));

			if (size > (1280 * 1280))
				System.out.println("文件大小：" + (size / 1280 / 1280) + "MB");
			else
				System.out.println("文件大小：" + (size / 1280) + "KB");

			System.out.println("修改时间：" + timeStr);
		}
		
		System.out.print("\n");

		if (textFile.isFile())
			System.out.println("是文件,名称：" + textFile.getName());
		else
			System.out.println("不是文件");

		if (dir.isDirectory())
			System.out.println("是目录");
		else
			System.out.println("不是目录");
		
		System.out.print("\n");

		File Dir = new File("C:\\abc\\a\\b\\c");
		Dir.mkdirs(); // 创建层级目录

		File homeDir = new File("C:\\Users\\Public\\Pictures");
		File jpgFile = new File(homeDir, "win7.jpg"); // 添加一个目录的子文件

		// 目录的扫描
		File d = new File("C:\\Users\\Administrator\\Documents");
		File[] subFile = d.listFiles();
		if (subFile != null)
		{
			for (File f : subFile)
			{
				if (f.isDirectory())
					System.out.println("目录：" + f.getName());
				else
					System.out.println("文件：" + f.getName());
			}
		}
		System.out.print("\n");
		 // 指定过滤器
		FileFilter filter = new FileFilter(){

			@Override
			public boolean accept(File pathname)
			{
				String filePath = pathname.getAbsolutePath();
				if( filePath.endsWith(".abr"))
					return true;
				return false;
			}
			
		};
		subFile = d.listFiles(filter);
		if (subFile != null)
		{
			for (File f : subFile)
			{
					System.out.println("ABR文件：" + f.getName());
			}
		}
		System.out.print("\n");
		// 递归扫描
		File D = new File("C:\\abc");
		Search search = new Search();
		search.search(D);
		System.out.print("\n");
		
		// 复制与移动 ( commons-io)
		File src = new File("C:\\abc\\abc.txt");
		File dst = new File("C:\\abc\\abc_copy.txt");
		
		try
		{
			FileUtils.copyFile(src, dst);
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}

	}

}
