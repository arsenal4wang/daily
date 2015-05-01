package org.wang.ceshi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * @author Administrator
 *
 */
public class A {
	public int a=10;
	public A() {
		System.out.println("这是A");
		System.out.println("a的值为："+a);
	}
	public String say() {
		return "say（）函数";
	}
	public static void main(String[] args) {
		A a=new A();
		
//		类A的类类型
		
		Class c1=A.class;
		Class c2=a.getClass();
		Class c3=null;
		System.out.println(c1==c2);
		try {
			c3=Class.forName("org.wang.ceshi.A");
		
			A a2=(A) c1.newInstance();
			System.out.println(a2.a);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println(c1.getName());
		/*
		 * 类类型中的方法名
		 */
		Method[] ms=c1.getMethods();
		for (Method method : ms) {
			System.out.println(method.getName());
		}
		/*
		 * 构造函数列表
		 */
//		Constructor[] constructor=c1.getDeclaredConstructors();
//		for (Constructor constructor2 : constructor) {
//			System.out.println(constructor2.getName()+"..");
//		}
		
		Field[] fs=String.class.getDeclaredFields();
		for (Field field : fs) {
			System.out.println(field.getName());
		}
	}

}
