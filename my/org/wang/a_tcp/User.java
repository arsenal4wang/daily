package org.wang.a_tcp;

import java.lang.reflect.Proxy;


public class User {
	int id;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.print("PPP");
	}
/*
	����һ������ҳ
 */

}

