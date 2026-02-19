package ab60;
class BaseClassAmazon
{
	private int age=20; //update to 49
	
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	private String emaild="sree@gmail.com";//her@gmail.com"
	
	public String getEmailid()
	{
		return emaild;
	}
	public void setEmailid(String emailid)
	{
		this.emaild=emailid;
	}
	
	private double salary=9.63;

	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}	
}
public class AmazonApplication 
{
	public static void main(String[] args) 
	{
		BaseClassAmazon b1=new BaseClassAmazon();
		b1.setAge(49);
		System.out.println(b1.getAge());
		
		b1.setEmailid("her@gmail.com");
		System.out.println(b1.getEmailid());
		
		b1.setSalary(12.5);
		System.out.println(b1.getSalary());
		
	}
}
