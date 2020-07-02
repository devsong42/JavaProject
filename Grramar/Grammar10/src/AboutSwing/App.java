package AboutSwing;

public class App
{

	public static void main(String[] args)
	{
		// 创建一个窗口
		AppFrame frame = new AppFrame("测试","阿飞你好");
		frame.setDefaultCloseOperation(AppFrame.EXIT_ON_CLOSE);
		frame.setTitle("一个窗口程序");
		frame.setSize(400, 300);
		frame.setVisible(true);

	}

}
