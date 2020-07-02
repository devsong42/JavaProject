package Interface;

// 一个类可以实现多个接口
public class XiaoDu implements AudioPlayer, RadioReceiver, Vod
{

	@Override
	public void searchAndPlay(String name)
	{
		System.out.println("找到视频，开始播放：" + name);

	}

	@Override
	public void playFM()
	{
		System.out.println("收音机启动...");

	}

	@Override
	public void play(int data)
	{
		System.out.println("播放音乐...");

	}

}
