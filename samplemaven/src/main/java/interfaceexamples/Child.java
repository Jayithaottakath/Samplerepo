package interfaceexamples;

public class Child implements Parent {
public void display() {
	System.out.println("this is ainterface chils");
	
}

	public static void main(String[] args) {
		//Child obj = new Child();
	
		//obj.display();
		//obj.print();
		//Reference creation
		Parent ref=new Child();
		ref.print();
		

	}
	@Override
	public void print() {
	System.out.println(" thgis a parent iterface");
		
	}

}
