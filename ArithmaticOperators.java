package ab60;
public class ArithmaticOperators 
{
	static void add()
	{
		 int a=100; //local variable
		//ram
		int b=200; //local variable
		int	c=	a+b; //local variable
		System.out.println(c);
	}
	static void sub()
	{
		//ram
		int a=100;//local variable
		int b=200;//local variable
		int	c=	b-a;//local variable
		System.out.println(c);
	}
	static void mul()
	{
		int a=100;//local variable
		int b=200;//local variable
		int	c=	b*a;//local variable
		System.out.println(c);
	}
	static void div()
	{
		int a=10;//local variable
		int b=200;//local variable
		int	c=	b/a;//local variable
		System.out.println(c);
	}
	static void mod()
	{
		int a=10;//local variable
		int b=29;//local variable
		int	c=	b%a;//local variable
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
	}
}
