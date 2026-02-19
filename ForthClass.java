package ab60;
public class ForthClass 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		add();
		subtract();
	}
	static void add()//action
	{
		System.out.println("Addition");
		subtract();
	}
	static void subtract()//action
	{
		System.out.println("Subtract");
	}
}
