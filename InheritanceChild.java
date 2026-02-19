package ab60;
class InheritanceParent
{
	static void add1()
	{
		System.out.println("add 1");
	}
	static void add2()
	{
		System.out.println("add 2");
	}
	 void add3()
	{
			System.out.println("add 3");
	}
	 void add4()
	{
			System.out.println("add 4");
	}
}
public class InheritanceChild extends InheritanceParent
{
	 void add5()
		{
				System.out.println("add 5");
		}
	public static void main(String[] args) 
	{
		add1();
		add2();
		InheritanceChild i1=new InheritanceChild();
		i1.add3();
		i1.add4();
		i1.add5();
	}
}
