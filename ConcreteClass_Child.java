package ab60;
abstract class AbstractClass_Parent  //abstract class
{
	abstract void method();   //abstract Method
}//this class and method I have created for exposing purpose
public class ConcreteClass_Child  extends AbstractClass_Parent //concrete CLass
{
	public static void main(String[] args) //concrete Method
	{
		
	}

	void method() 
	{
		System.out.println("Add the real logic here");
	}
}
