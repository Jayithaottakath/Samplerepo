package exceptinhandling;

public class customexemption {

	public static void main(String[] args) throws Votingexception {
		int a  =10;

		if (a>18)
			
		{
			System.out.println("eligible for vote");
			
		}
		else
		{
			throw new Votingexception ("note eligible");
		}
		}
		

	}


