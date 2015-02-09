package org.wang.json;

import net.sf.json.JSONObject;

public class testJson {

	public static void main(String[] args) {
		JsonService service=new JsonService();
		System.out.println(service.createJsonObject("wo",service.getPerson()));
		System.out.println("*****");
		System.out.println("*****");
		System.out.println(service.object.get("wo"));
	}
}
