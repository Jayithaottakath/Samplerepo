package inheritance;

public class HirarchielChild1 extends HirachielParent {
	
	public void display ()
	{
		System.out.println(" this hirachiel child1");
	}

	public static void main(String[] args)  {
		
		HirarchielChild1 obj = new HirarchielChild1();
	obj.display();
	obj.sum(5, 9);
	
		
	}

}
