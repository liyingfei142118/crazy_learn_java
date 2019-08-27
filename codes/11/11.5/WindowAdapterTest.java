
import java.awt.*;
import java.awt.event.*;
/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2020, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 5.0
 */
public class WindowAdapterTest
{
	private Frame f = new Frame("����");
	private TextArea ta = new TextArea(6, 40);
	public void init()
	{
		f.addWindowListener(new MyListener());
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	class MyListener extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			System.out.println("�û��رմ��ڣ�\n");
			System.exit(0);
		}
	}
	public static void main(String[] args)
	{
		new WindowAdapterTest().init();
	}
}
