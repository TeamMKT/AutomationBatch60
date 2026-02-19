package ab60;
class Teacher
{
	static void java()
	{
		
	}
	static void selenium()
	{
		
	}
}
public class Student extends Teacher
{
	public static void main(String[] args) 
	{
			Teacher t1	=new Student();//syntax of upcasting
			//after doing upcasting u can only access parent class properties
			t1.java();
			t1.selenium();
			
			
	}
}
