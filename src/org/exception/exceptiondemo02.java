package org.exception;

public class exceptiondemo02 {

	public static void main(String[] args) {
		try {
			String str1 = "10";
			String str2 = "0" +"3";
			int i = Integer.parseInt(str1);
			int j = Integer.parseInt(str2);
			int temp = i / j;
			System.out.println("两数相除的结果为" + temp);
		} catch (ArithmeticException e) {
			System.out.println("出现异常" + e);

		} finally {
			System.out.println("不管执行哪部分，此部分都执行");
		}
	}
}
