package abstraction;

public class AbstractClassChild  extends  AbstractClassParent{
	
public void show()
{
	System.out.println("child class");
	
}
	public static void main(String[] args) {
		AbstractClassChild  obj = new AbstractClassChild ();
		obj.display();
		obj.print();
		obj.show();

	}
	@Override
	public void display() {
		System.out.println("helloochild");
		
	}
	@Override
	public void print() {
	System.out.println("helloparent");
		
	}

}
