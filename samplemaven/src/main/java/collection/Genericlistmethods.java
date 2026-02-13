package collection;

import java.util.ArrayList;
import java.util.List;

public class Genericlistmethods {

	public static void main(String[] args) {
		List <String> L = new ArrayList <String> ();
		L.add("apple");
		L.add("orange");
		L.add("grapes");
		System.out.println(L);
		System.out.println(L.get(2));
		L.set(1, "strowberry");
		System.out.println(L);
		System.out.println(L.indexOf("apple"));
		System.out.println(L.lastIndexOf("grapes"));
		L.remove("grapes");
		System.out.println(L);
		System.out.println(L.contains("Kiwi"));
		System.out.println(L.isEmpty());
		System.out.println(L.size());
		
		

	}

}
