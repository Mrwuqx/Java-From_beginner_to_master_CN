package com.lzw;

import java.util.*;

public class Muster { // ������Muster
	public static void main(String args[]) {
		Collection list = new ArrayList(); // ʵ�������������
		list.add("a"); // �򼯺��������
		list.add("b");
		list.add("c");
		Iterator it = list.iterator(); // ����������
		while (it.hasNext()) { // �ж��Ƿ�����һ��Ԫ��
			String str = (String) it.next(); // ��ȡ������Ԫ��
			System.out.println(str);
		}
	}
}
