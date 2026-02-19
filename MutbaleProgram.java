package ab60;
public class MutbaleProgram 
{
	public static void main(String[] args)
	{
		String a="Automation";//immutable
		String b=a.concat("Testing");
			System.out.println(a); 
			System.out.println(b); 
			
		
		StringBuffer s1=new StringBuffer("Manual");	//mutable
					s1.append("Testing");
				System.out.println(s1);	
				
		StringBuilder s2=new StringBuilder("API");	//mutable
						s2.append(" Testing");
					System.out.println(s2);	
				
				
	}
}
