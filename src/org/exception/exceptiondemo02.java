package org.exception;

public class exceptiondemo02 {

	public static void main(String[] args) {
		try {
			String str1 = "10";
			String str2 = "0" +"3";
			int i = Integer.parseInt(str1);
			int j = Integer.parseInt(str2);
			int temp = i / j;
			System.out.println("��������Ľ��Ϊ" + temp);
		} catch (ArithmeticException e) {
			System.out.println("�����쳣" + e);

		} finally {
			System.out.println("����ִ���Ĳ��֣��˲��ֶ�ִ��");
		}
	}
}
