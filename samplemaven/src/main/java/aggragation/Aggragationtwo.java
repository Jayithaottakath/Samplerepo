package aggragation;

public class Aggragationtwo {
	
	String city;
	String state;
	Aggragationone  ref;
	
	
	public Aggragationtwo(String city,String state,Aggragationone  ref) 
	{
		
		this.ref = ref;
		this.city = city;
		this.state = state;
		
	
	}
public void display()

{
	System.out.println(ref.name);
	System.out.println(ref.rollno);
	System.out.println(ref.address);
	System.out.println(city);
	System.out.println(state);
}
	public static void main(String[] args) {
		
		Aggragationone  obj = new Aggragationone ("jayitha", 23, "thrissur");
		Aggragationtwo obj1 = new Aggragationtwo("edappal","kerala",obj);
		obj1.display();
	}

}
