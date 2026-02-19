package ab60;
public class GlobalLocal4 
{
	static int z=100;
	static void add()
	{
		System.out.println(z);
	}
	public static void main(String[] args) 
	{
		int z=500;
		System.out.println(z);
		//System.out.println(GlobalLocal4.z);
		
	}
}
