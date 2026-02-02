package plymorphisam;

public class PolyChild extends PolyParent {
	
	

	public void print (int a, int b)
	
	{
		super.print(8, 2);
		int c = a-b;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		
		PolyChild obj = new PolyChild();
		obj.print(10, 5);
		
	}

}
