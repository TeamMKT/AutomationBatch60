package ab60;
public class GlobalVariable 
{
	int noOfDays=365;  //global varibale-Instance Variable
	final static int noOfHours=24; //global varibale
	static double  answer;
	
	static void methdo1()
	{
		final  int c=14;
		
		 System.out.println(c);
	//	System.out.println(noOfHours);//24
	}
	static void methdo2()
	{
		System.out.println(noOfHours);//24
	}
	public static void main(String[] args) 
	{
		/*int second=60;  //local variable
		String name="Ram Tiwari"; //local variable
		System.out.println(answer);//24
		noOfHours=48;
		System.out.println(noOfHours);//24
	//	methdo1();
	//	methdo2();
	*/
		methdo1();
	}
}




