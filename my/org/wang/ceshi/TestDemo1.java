package org.wang.ceshi;



public class TestDemo1 implements Cloneable,Comparable<String>{
	int a;
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public TestDemo1(){
	}
	
	public TestDemo1(TestDemo1 t){
		this.a=t.a;
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		TestDemo1 test1=new TestDemo1();
		TestDemo1 tDemo=(TestDemo1) test1.clone();
		
		TestDemo2 aDemo2=new TestDemo2();
		aDemo2.show();
		
		System.out.println(test1);
		System.out.println(tDemo);
		System.out.println(tDemo.clone().getClass().getName());
		System.out.println(tDemo.clone().getClass()==test1.getClass());
		
//		Set<String> set=new TreeSet<>();
//		java.util.Collections.addAll(set,args);
//		System.out.println(set);
	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
