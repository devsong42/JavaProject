package Interface;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AppFrame extends JFrame
{
	public JLabel label = new JLabel("阿飞你好");
	public JButton testButton = new JButton("测试");
	public AppFrame()
	{
		// 创建一个容器，设置为根容器
		JPanel root = new JPanel();
		this.setContentPane(root);
		
		// 添加控件
		root.add(testButton);
		root.add(label);
		
		// 添加按钮事件
		MyActionListener listener = new MyActionListener(this);
		testButton.addActionListener(listener);

	}
	
	public static void main(String[] args)
	{
		// 创建一个窗口
		AppFrame frame = new AppFrame();
		frame.setDefaultCloseOperation(AppFrame.EXIT_ON_CLOSE);
		frame.setTitle("一个窗口程序");
		frame.setSize(400, 300);
		frame.setVisible(true);

	}

}
