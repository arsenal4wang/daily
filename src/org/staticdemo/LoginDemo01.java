package org.staticdemo;
public class LoginDemo01 {
	public static void main(String args[]) {
		String name = args[0];
		String password = args[1];
		if (name.equals("abc") && password.equals("123"))
			System.out.println("µÇÂ¼³É¹¦£¡");
		else
			System.out.println("µÇÂ¼Ê§°Ü");

	}
}
