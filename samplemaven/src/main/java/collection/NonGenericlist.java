package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGenericlist {

	public static void main(String[] args) {
		List L = new ArrayList();
		
		L.add("apple");
		L.add(1.2f);
		L.add("grapes");
		L.add(25);
		
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
