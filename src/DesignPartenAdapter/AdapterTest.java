package DesignPartenAdapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class AdapterTest {
	public static void main(String[] args) {
		DrawAdapter adapter=new DrawAdapter(new Circle(),new Squar());
//		adapter.drawCircle();
//		adapter.drawSquar();
		List<Integer> list=new ArrayList<>();
		System.err.println(list.iterator().getClass().getInterfaces());
//		Enumeration<E>
	}
}
