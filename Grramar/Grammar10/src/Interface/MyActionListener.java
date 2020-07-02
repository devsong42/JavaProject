package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener
{
	AppFrame ui;
	
	public MyActionListener(AppFrame frame)
	{
		this.ui = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		ui.label.setText("阿飞很好");
		System.out.println("我被点中了！");
		ui.testButton.setText("好好好");
		
	}

}
