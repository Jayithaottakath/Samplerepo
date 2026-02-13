package collection;

import java.util.HashSet;
import java.util.Set;

public class GenericSetmethod {

	public static void main(String[] args) {
		Set <String> a = new HashSet <String> ();
		a.add("jayitha");
		a.add("haritha");
		a.add("gouri");
		Set <String> b = new HashSet <String> ();
		b.add("anu");
		b.add("kadeeja");
		b.add("sreevidya");
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
