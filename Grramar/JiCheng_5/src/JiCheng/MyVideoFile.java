package JiCheng;

public class MyVideoFile extends MyFile //表示子类（左）继承于父类（右）
{
	//父类的public成员自动继承
	
	//添加子类属性
	public int duration;
	
	public void play()
	{
		System.out.println("播放视频"+name);
	}
	public void stop()
	{
		System.out.println("停止播放"+name);
	}
	
	//父类方法的重写
	@Override
	public void info()
	{
//		System.out.println("文件名:" + name +"文件大小:" + size +"时长:" + duration);
		
		super.info(); //表示先调用父类的info方法
		System.out.println(",时长:"+duration);
	}

}
