package ab60;

import java.util.Arrays;

public class ToCharArray 
{
	public static void main(String[] args) 
	{
		int [] rollno=new int[4];
		rollno[0]=45;
		rollno[1]=40;
		rollno[2]=74;
		rollno[3]=15;
		
		System.out.println(Arrays.toString(rollno));
		
	/*	for(int i=0;i<rollno.length;i++)
		{
		System.out.println(rollno[i]);
		}
	*/	
		String [] name=new String[4];
				  name[0]="anjali";
				  name[1]="sonu";
				  name[2]="ankita";
				  name[3]="avinash";

	/*for(int i=0;i<name.length;i++)
	{
		System.out.println(name[i]);
	}
	*/
	System.out.println(Arrays.toString(name));
		
	}
}
