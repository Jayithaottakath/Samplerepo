package superkeywords;

public class SupermethodChild  extends SuperMethodParent
{
  public void display()
		  
		  {
	  super.display();
	  System.out.println("supermethod child");
	  
		  }
	public static void main(String[] args) 
	{
		SupermethodChild obj = new SupermethodChild();
		obj.display();
		
	}

}
