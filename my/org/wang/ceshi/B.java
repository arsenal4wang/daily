package org.wang.ceshi;

import org.thisdemo.thisDemo01;

public class B extends A {
//	public int a;
	public B() {
		System.out.println("’‚ «B");
		this.a=90;
	}
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.a);
	}
}
