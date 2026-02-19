package ab60;
public class InfinityProgram 
{
	public static void main(String[] args) 
	{
		try {
		int c=1/0; //a/b->A from parent class? b->grand parent class?
		System.out.println(c);
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Exception Handling");
		}
		//10000 code prrsent hefre
	}
}
