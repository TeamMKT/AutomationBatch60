package ab60;
public class StudentDetails 
{
	int stdId;    //instance variable
	double pocketMoney; //instance variable
	String stdName; //instance variable
	void studentHostel(int employeeId,double salary,String empame)
	{
		this.stdName=empame;
		this.stdId=employeeId;
		this.pocketMoney=salary;
		
	/*	System.out.println("Student id is-> "+stdId);
		System.out.println("Student pocket money is-> "+pocketMoney);
		System.out.println("Student name is-> "+name);
		*/
	}
	void studentHostel(double salary,int employeeId,String empame)
	{
		this.stdName=empame;
		this.stdId=employeeId;
		this.pocketMoney=salary;
		
	}
	public static void main(String[] args) 
	{
		
		StudentDetails s1=new StudentDetails();
		s1.studentHostel(45, 500, "ram");
		System.out.println(s1.stdId);
		System.out.println(s1.stdName);
		System.out.println(s1.pocketMoney);

		
	}
}
