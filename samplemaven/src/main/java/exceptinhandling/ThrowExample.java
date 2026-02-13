package exceptinhandling;

public class ThrowExample {

	public static void main(String[] args) {
	int a  =10;

	if (a>18)
		
	{
		System.out.println("eligible for vote");
		
	}
	else
	{
		throw new ArithmeticException ("note eligible");
	}
	}
	}


