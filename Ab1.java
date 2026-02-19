package ab60;
abstract class Ab3 //100 % abstraction
{
	abstract void add();
	abstract void sub();
}
abstract class Ab2 extends Ab3 //100 % abstraction
{
	abstract void mul();
	abstract void div();
}
public class Ab1 extends Ab2
{
	void add()
	{
		System.out.println("Real Logic of Add will be here");
	}
	void sub()
	{
		System.out.println("Real Logic of sub will be here");

	}void mul()
	{
		System.out.println("Real Logic of mul will be here");

	}void div()
	{
		System.out.println("Real Logic of div will be here");

	}
	public static void main(String[] args) 
	{
		
	}
}
