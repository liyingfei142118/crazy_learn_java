

/**
 * Description:
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2020, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 5.0
 */
public class ExecTest
{
	public static void main(String[] args)
		throws Exception
	{
		var rt = Runtime.getRuntime();
		// 运行记事本程序
		rt.exec("notepad.exe");
	}
}
