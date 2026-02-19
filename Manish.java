package ab60;
public class Manish 
{
	static void add()
	{
		System.out.println("Addtion");
	}
	void sub()
	{
		System.out.println("Subtraction");
	}
	void mul()
	{
		System.out.println("Multiplication");
	}
	public static void main(String[] args) 
	{
		add();
		Manish m=new Manish();//syntax to create an Object
		m.sub();//calling non static method
		m.mul();
		m.sub();
		m.sub();
		
		Manish m1=new Manish();
		m1.sub();
		m1.mul();
	}
}
