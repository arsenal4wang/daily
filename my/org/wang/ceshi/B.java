package org.wang.ceshi;

import java.lang.reflect.Method;
import java.util.ArrayList;


public class B {

	public B(){
		System.out.println("&&&");
	}
	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("hello");
		ArrayList a2=new ArrayList<>();
		
		Class class1=a1.getClass();
		Class class2=a2.getClass();
		System.out.println(class1==class2);
		
		try {
			System.out.println("+++");
			Method m=class1.getMethod("add", Object.class);
			m.invoke(a1,100);
			System.out.println(a1);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		try {
			Class class3=Class.forName("org.wang.ceshi.B");
			try {
				class3.newInstance();
				
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
