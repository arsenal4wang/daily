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
		System.out.println("����A");
		System.out.println("a��ֵΪ��"+a);
	}
	public String say() {
		return "say��������";
	}
	public static void main(String[] args) {
		A a=new A();
		
//		��A��������
		
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
		 * �������еķ�����
		 */
		Method[] ms=c1.getMethods();
		for (Method method : ms) {
			System.out.println(method.getName());
		}
		/*
		 * ���캯���б�
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
