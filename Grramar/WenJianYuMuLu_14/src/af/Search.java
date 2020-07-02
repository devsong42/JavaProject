package af;

import java.io.File;

public class Search
{
	public void search(File dir)
	{
		File[] files = dir.listFiles();
		
		if(files == null) return;
		
		for(File f : files)
		{
			if (f.isFile())
				System.out.println("文件：" + f.getAbsolutePath());
			else
			{
				System.out.println("目录：" + f.getAbsolutePath());
				search(f); // 递归调用
			}
		}
	}

}
