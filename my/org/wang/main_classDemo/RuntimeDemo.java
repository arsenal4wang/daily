package org.wang.main_classDemo;

import java.io.IOException;

public class RuntimeDemo {
	/**
	 * runtime 是一个封装的了JVM进程的类，每一个JAVA程序都是启用了jvm的一个进程的一个进程 可以观察JVM内存的使用量
	 * 可以直接使用Runtime的本机的可执行程序 例如 调用记事本 * runtime是单态设计的
	 * 在使用中只存在一个JVM的对象。不能有第二个Runtime的对象出现。
	 */
	public static void main(String[] args) {
		/*
		 * Runtime();Runtime的构造函数是私有的 故不能new 只能使用Runtime的静态方法来得到它的对象。
		 */
		Runtime rt = Runtime.getRuntime();
		System.out.println("JVM的最大内存量" + rt.maxMemory());
		System.out.println("JVM的空闲内存量" + rt.freeMemory());
		String str = "Hello world";
		for (int i = 0; i < 100; i++) {
			str += i;
		}
		System.out.println(str);
		System.out.println("操作之后的JVM的空闲内存量：" + rt.freeMemory());
		rt.gc();
		System.out.println("来及回收之后JVM的空闲内存量：" + rt.freeMemory());
		System.out.print("\n\n使用stringbufer产生的内存如下：");
		System.out.println("JVM的最大内存量" + rt.maxMemory());
		System.out.println("JVM的空闲内存量" + rt.freeMemory());
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("Hello world");
		for (int i = 0; i < 100; i++) {
			sBuffer.append(i);
		}
		System.out.println("操作之后的JVM的空闲内存量：" + rt.freeMemory());
		rt.gc();// 垃圾回收之后
		System.out.println("来及回收之后JVM的空闲内存量：" + rt.freeMemory());

		Process p = null;
		try {
			p = rt.exec("notepad.exe");// 打开记事本 exec（）的返回值是Process（）类的对象
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);// 线程的存活时间为5秒
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p.destroy();// 进程被销毁了
	}
}
