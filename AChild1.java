package ab60;
class Ab
{
	static void login()
	{
		System.out.println("ABle to login to aplication");
	}
	static void logout()
	{
		System.out.println("ABle to logout from aplication");
	}
}
public class AChild1 extends Ab
{
	public static void main(String[] args) 
	{
		login();
		logout();
		
	}
}
