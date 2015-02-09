package org.stringclass;

public class StringApiDemo {
	public static void main(String[] args) {
		String str = "Hello World�� �� ��";
		char c1[] = str.toCharArray();// ���ַ�����Ϊ�ַ�����
		for (int i = 0; i < c1.length; ++i)
			System.out.println(c1[i]);
		String str1 = new String(c1);// ���ַ������Ϊ�ַ���
		String str2 = new String(c1, 1, 6);// ���ַ������ĳ��λ��
		System.out.println(str1);
		System.out.println(str2);
		byte strb[] = str.getBytes();// ���ַ�����Ϊ�ֽ�����
		for (int j = 0; j < strb.length; ++j)
			System.out.println("�ֽڣ�" + strb[j]);
		String strb2 = new String(strb);
		System.out.println(strb2);
		System.out.println(str.startsWith("Hello"));// �ж��Ƿ�����ĳ���ַ�����ͷ��Str.startWith(String
		System.out.println(str.startsWith("1Hello")); // args
		String newStr = str.replaceAll("l", "x");
		System.out.println(newStr);
		String substr = str.substring(6);
		System.out.println(substr);
		System.out.println(str.substring(4, 7));
		String s[] = str.split(" ");// ���ո���ַ������в��
		for (String si : s) { // foreach ���
			System.out.println(si);
		}
		System.out.println(str.contains("Hello"));// �����ַ����������Ļ�����������true,����false
		System.out.println(str.indexOf("o"));// �����ַ����������ڵ�λ��
		System.out.println(str.indexOf("h"));// �鿴�ַ����ڵ�λ��
		System.out.println(str.indexOf("H", 2));// �ӵڶ����ַ���ʼ��H�������ڣ����-1
		System.out.println(str.toUpperCase());// ת���ɴ�д
		System.out.println(str.trim());// ȥ���������ߵĿո�
		System.out.println(str.trim().length());// ȥ���������ߵĿո�֮����ַ����ĳ���
	}
}
