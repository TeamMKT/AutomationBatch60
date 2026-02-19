package ab60;
public class ArithmaticOperators2 
{
	static int add()
	{
		int a=100;
		int b=200;
		int	c=	a+b;
		return c;
	}
	static void sub()
	{
		int a=100;
		int b=200;
		int	c=	b-a;
		System.out.println(c);
	}
	static void mul()
	{
		int a=100;
		int b=200;
		int	c=	b*a;
		System.out.println(c);
	}
	static void div()
	{
		int a=10;
		int b=200;
		int	c=	b/a;
		System.out.println(c);
	}
	static void mod()
	{
		int a=10;
		int b=29;
		int	c=	b%a;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		System.out.println(add());
		
	}
}
