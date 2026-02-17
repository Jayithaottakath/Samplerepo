package inheritance;

public class SingleChild  extends SingleParent{
public void display()
{
	System.out.println("This is a child");
}
	public static void main(String[] args) {
		SingleChild obj = new SingleChild ();
		obj.display();
		obj.print();

	}

}
