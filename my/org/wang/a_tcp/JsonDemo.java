package org.wang.a_tcp;


import java.awt.geom.Area;
import java.util.ArrayList;



import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonDemo {

	public static void main(String[] args) {
		User user=new User(10,"邓小平");
		JSONObject jsonObject=JSONObject.fromObject(user);
		
		String name="{'we':'Area'}";
		JSONObject object=JSONObject.fromObject(name);
		System.out.println(object);
	
		ArrayList<User> list=new ArrayList<>();
		list.add(new User(22, "江泽民"));
		list.add(new User(11,"习近平"));
		JSONArray jsonList=JSONArray.fromObject(list);
		
		User[] users={new User(22, "李克强"), new User(11,"汪洋")};
		JSONArray jsonArray=JSONArray.fromObject(users);
		
		
		System.out.println(jsonObject);
		System.out.println(jsonList);
		System.out.println(jsonArray);
	}
}
