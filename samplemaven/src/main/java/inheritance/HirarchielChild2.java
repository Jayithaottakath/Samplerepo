package inheritance;

public class HirarchielChild2  extends HirachielParent{
	public void print()
	{
		System.out.println("this is a child1");
	}

	public static void main(String[] args) {
		 HirarchielChild2 obj = new  HirarchielChild2();
		 obj.print();
		 obj.sum(1, 2);

	}

}
