package AboutSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AppFrame extends JFrame
{
	public AppFrame(String Button, String Label)
	{
		// 创建一个容器，设置为根容器
		JPanel root = new JPanel();
		this.setContentPane(root);
		
		// 添加一个控件
		JButton testButton = new JButton(Button);
		root.add(testButton);
		
		// 添加一个标签控件
		JLabel label = new JLabel(Label);
		root.add(label);

	}

}
