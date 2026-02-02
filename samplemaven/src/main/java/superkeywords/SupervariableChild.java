package superkeywords;

public class SupervariableChild extends SuperKeywords {
	
	int a = 6;
	
	public void display()
	
	{
		System.out.println(super.a);
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		SupervariableChild obj = new SupervariableChild();
		obj.display();
		// TODO Auto-generated method stub

	}

}
