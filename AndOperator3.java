package ab60;
public class AndOperator3 
{
	public static void main(String[] args) 
	{
		int a=20;
		int b=10;
		int c=30;
		
	
		if(!(!((a>15 || b==c)|| c==30)))
		{
			System.out.println("Conditional Statement 1");
		}
		
		if((a>15 || b==c)&& c==30)
		{
			System.out.println("Conditional Statement 2");
		}
		
		
	}
}
