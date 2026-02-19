package ab60;
 class MethodParent
{
	 void login()
	{
		System.out.println("Login using email id");
	}
}
public class MethodOveride extends MethodParent
{
	void login_mobileno()
	{
		System.out.println("Login using mobile no");

	}
	public static void main(String[] args) 
	{
		if(1==1)//mobile no
		{
		MethodOveride m1=new MethodOveride();
		m1.login();
		}
		else  
		{
		MethodParent p1=new MethodParent();
		p1.login();
		}
	
	}
}
