package interfaceexamples;

public class MltipleChild implements Multipleparent3 ,MultipleParenttwo{
	
public void display()
{
	System.out.println("this is child");
}
	public static void main(String[] args) {
		MltipleChild obj = new MltipleChild();
		obj.display();
		obj.print();
		obj.print();

	}

	@Override
	public void print() {
		System.out.println("This is parentone");
		
	}

	@Override
	public void show() {
		System.out.println("this is aparent two");
		
	}

}
