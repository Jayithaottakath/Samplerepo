package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iteratorexample {

	public static void main(String[] args) {
		Set <String> a = new HashSet<String>();
		a.add("apple");
		a.add("orange");
		a.add("grapes");
		a.add("mango");
		a.add("kiwi");
		System.out.println(a);
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(a);

	}

}
