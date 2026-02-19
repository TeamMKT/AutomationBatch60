package ab60;
public class GlobalVariable2 
{
	int noOfDays=365;  //global varibale-Instance Variable
	static int noOfHours=24; //global varibale
	static boolean  answer;

	public static void main(String[] args) 
	{
		answer=true;
		noOfHours=36;
		System.out.println(answer);//24
		System.out.println(noOfHours);//24

	
	}
}




