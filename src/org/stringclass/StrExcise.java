package org.stringclass;
import java.util.Scanner;
public class StrExcise {
	public static void main(String[] args) {
		String str = "TOM:80|JERRY:90|JAMES:100";
		String s1[] = str.split("\\|");
		for (int i = 0; i < s1.length; ++i) {
			String s2[] = s1[i].split(":");
			System.out.println(s2[0] + "����>" + s2[1]);
		}
		System.out.println("������������ַ : ");
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		//StrExcise text = new StrExcise();
		// Scanner s5=new Scanner(System.in);
		//if (text.Validate(str1))
			//System.out.println("������������ַ��ʽ��ȷ��");
	//	else
		//	System.out.println("������������ַ��ʽ����");
		if (Validate(str1))
			System.out.println("������������ַ��ʽ��ȷ��");
		else
			System.out.println("������������ַ��ʽ����");

	}

	public static boolean Validate(String email) {
		boolean flag = true;
		if (email.indexOf("@") == -1 || email.indexOf(".") == -1)
			flag = false;
		if (flag)
			if (email.indexOf("@") > email.indexOf("."))
				flag = false;
			else
				flag = true;
		return flag;
	}
}

/*
 * ��ֳ�������ʾ����ʽ�� TOM����>80 JERRY����>90 JAMES����>100
 */