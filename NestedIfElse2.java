package ab60;
public class NestedIfElse2 
{
	public static void main(String[] args) 
	{
	int a=10;
	int b=20;
	if(a<b)
	{
		System.out.println("1");
		if(a>=10)
		{
			System.out.println("2");

				if(a==25)
				{
					System.out.println("3");
				}
				else
				{
					System.out.println("4");
				}
		}
		else
		{
			System.out.println("4");
		}
		
	}
	else
	{
		System.out.println("Statement 3");
	}
		
		
		
	}
}
