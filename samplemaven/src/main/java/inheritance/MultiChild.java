package inheritance;

public class MultiChild extends MultiParent{
	
	public void show()
	{
		System.out.println("This is a multichild");
	}

	public static void main(String[] args) {
		
		MultiChild obj = new MultiChild ();
		obj.display();
		obj.print();
		obj.show();
		

	}

}
