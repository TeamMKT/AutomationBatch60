package ab60;
public class SIBIIB 
{
	SIBIIB()
	{
		System.out.println("This is my constructor");
	}
	static
	{
		System.out.println("This is my SIB");
	}
	{
		System.out.println("This is my IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("This is my Main Method");
		new SIBIIB();
		new SIBIIB();

	}
}
