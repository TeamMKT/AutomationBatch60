package ab60;
import java.util.Scanner;

//square AREa
public class ScannerProgram1 
{
	public static void main(String[] args) 
	{
	
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of a:");
		double a=s1.nextDouble();
		
		double area=a*a;
		System.out.println(area);
		s1.close();
	}
	}
