package org.wang.json;

import net.sf.json.JSONObject;

public class JsonService {
	public static JSONObject object=new JSONObject();
	public Person getPerson() {
		Person person=new Person(1000,"��ҫ��", "��");
		return person;
	}
	public String createJsonObject(String key,Object value){
		object.put(key, value);
		return object.toString();
	}
}
