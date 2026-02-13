package collection;

import java.util.HashSet;
import java.util.Set;

public class ForeachLoop {
	public static void main(String[] args) {
		Set <String> a = new HashSet <String> ();
		a.add("apple");
		a.add("orange");
		a.add("grapes");
		a.add("mango");
		a.add("kiwi");
		for (String b:a)
		{
			System.out.println(b);
		}

}
}
