package org.stringclass;
import java.util.Scanner;
public class StrExcise {
	public static void main(String[] args) {
		String str = "TOM:80|JERRY:90|JAMES:100";
		String s1[] = str.split("\\|");
		for (int i = 0; i < s1.length; ++i) {
			String s2[] = s1[i].split(":");
			System.out.println(s2[0] + "——>" + s2[1]);
		}
		System.out.println("输入待测邮箱地址 : ");
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		//StrExcise text = new StrExcise();
		// Scanner s5=new Scanner(System.in);
		//if (text.Validate(str1))
			//System.out.println("您输入的邮箱地址格式正确！");
	//	else
		//	System.out.println("您输入的邮箱地址格式错误！");
		if (Validate(str1))
			System.out.println("您输入的邮箱地址格式正确！");
		else
			System.out.println("您输入的邮箱地址格式错误！");

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
 * 拆分成如下所示的形式： TOM——>80 JERRY——>90 JAMES——>100
 */