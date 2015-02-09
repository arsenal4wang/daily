package org.wang.a_tcp;


import java.awt.geom.Area;
import java.util.ArrayList;



import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonDemo {

	public static void main(String[] args) {
		User user=new User(10,"��Сƽ");
		JSONObject jsonObject=JSONObject.fromObject(user);
		
		String name="{'we':'Area'}";
		JSONObject object=JSONObject.fromObject(name);
		System.out.println(object);
	
		ArrayList<User> list=new ArrayList<>();
		list.add(new User(22, "������"));
		list.add(new User(11,"ϰ��ƽ"));
		JSONArray jsonList=JSONArray.fromObject(list);
		
		User[] users={new User(22, "���ǿ"), new User(11,"����")};
		JSONArray jsonArray=JSONArray.fromObject(users);
		
		
		System.out.println(jsonObject);
		System.out.println(jsonList);
		System.out.println(jsonArray);
	}
}
