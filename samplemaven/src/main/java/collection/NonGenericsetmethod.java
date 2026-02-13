package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGenericsetmethod {

	public static void main(String[] args) {
		Set a = new HashSet  ();
		a.add("jayitha");
		a.add(2.5f);
		a.add("gouri");
		Set b = new HashSet  ();
		b.add("anu");
		b.add(25);
		b.add(18);
		a.addAll(b);
		System.out.println(a);
		System.out.println(a.contains("gouri"));
		System.out.println(b.containsAll(a));
		System.out.println(a.isEmpty());
		a.remove("jayitha");
		System.out.println(a);
		System.out.println(a.removeAll(b));
		System.out.println(a);
		System.out.println(a.size());
		

	}

}
