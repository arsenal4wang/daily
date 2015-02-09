package org.wang.main_classDemo;

import java.io.IOException;

public class RuntimeDemo {
	/**
	 * runtime ��һ����װ����JVM���̵��࣬ÿһ��JAVA������������jvm��һ�����̵�һ������ ���Թ۲�JVM�ڴ��ʹ����
	 * ����ֱ��ʹ��Runtime�ı����Ŀ�ִ�г��� ���� ���ü��±� * runtime�ǵ�̬��Ƶ�
	 * ��ʹ����ֻ����һ��JVM�Ķ��󡣲����еڶ���Runtime�Ķ�����֡�
	 */
	public static void main(String[] args) {
		/*
		 * Runtime();Runtime�Ĺ��캯����˽�е� �ʲ���new ֻ��ʹ��Runtime�ľ�̬�������õ����Ķ���
		 */
		Runtime rt = Runtime.getRuntime();
		System.out.println("JVM������ڴ���" + rt.maxMemory());
		System.out.println("JVM�Ŀ����ڴ���" + rt.freeMemory());
		String str = "Hello world";
		for (int i = 0; i < 100; i++) {
			str += i;
		}
		System.out.println(str);
		System.out.println("����֮���JVM�Ŀ����ڴ�����" + rt.freeMemory());
		rt.gc();
		System.out.println("��������֮��JVM�Ŀ����ڴ�����" + rt.freeMemory());
		System.out.print("\n\nʹ��stringbufer�������ڴ����£�");
		System.out.println("JVM������ڴ���" + rt.maxMemory());
		System.out.println("JVM�Ŀ����ڴ���" + rt.freeMemory());
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("Hello world");
		for (int i = 0; i < 100; i++) {
			sBuffer.append(i);
		}
		System.out.println("����֮���JVM�Ŀ����ڴ�����" + rt.freeMemory());
		rt.gc();// ��������֮��
		System.out.println("��������֮��JVM�Ŀ����ڴ�����" + rt.freeMemory());

		Process p = null;
		try {
			p = rt.exec("notepad.exe");// �򿪼��±� exec�����ķ���ֵ��Process������Ķ���
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);// �̵߳Ĵ��ʱ��Ϊ5��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p.destroy();// ���̱�������
	}
}
