package org.wang.ceshi;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class TestDemo2 implements Cloneable,Comparable<String>{

	public TestDemo2(){
	}
	
	
	public static void main(String[] args) throws Exception {
		TestDemo2 test1=new TestDemo2();
		TestDemo2 tDemo=(TestDemo2) test1.clone();
		
		
		System.out.println(test1);
		System.out.println(tDemo);
		System.out.println(tDemo.clone().getClass().getName());
		System.out.println(tDemo.clone().getClass()==test1.getClass());
		
//		Set<String> set=new TreeSet<>();
//		java.util.Collections.addAll(set,args);
//		System.out.println(set);
	}
	 void show(){
		
	}
	@Override
	public int compareTo(String o) {
		return 0;
	}

}
