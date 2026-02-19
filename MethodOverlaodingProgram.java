package ab60;
public class MethodOverlaodingProgram 
{
	static void add(int a,int b)   //local variable
	{
		int sum=a+b;//sum-//local variable
		System.out.println(sum);
	}
	static void add(int a,double b)//local variable
	{
		double sum=a+b;//local variable
		System.out.println(sum);
	}
	 void add(double a,double b)//local variable
	{
		double sum=a+b;//local variable
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		add(45,65);
		add(45,65.85);
		MethodOverlaodingProgram m1=new MethodOverlaodingProgram();
		m1.add(12.36, 25.36);
	}
}
