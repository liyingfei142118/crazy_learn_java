
import java.util.*;
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
public class LinkedHashSetTest
{
	public static void main(String[] args)
	{
		var books = new LinkedHashSet();
		books.add("���Java����");
		books.add("������Java EE��ҵӦ��ʵս");
		System.out.println(books);
		// ɾ�� ���Java����
		books.remove("���Java����");
		// �������� ���Java����
		books.add("���Java����");
		System.out.println(books);
	}
}
