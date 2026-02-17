package accessmodifiers;

public class AccesOne {
	
	public void print1()
	{
		System.out.println("public");
		
	}
private void display2()
{
System.out.println("private");
}
protected void show3()
{
System.out.println("protected");

}
void display4()
{
 System.out.println("default");
}

	public static void main(String[] args) {
		AccesOne obj = new AccesOne();
		obj.display2();
		obj.display4();
		obj.print1();
		obj.show3();
		
		
	}

}
