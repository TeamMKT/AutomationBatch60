package ab60;
public class ArrayProblem5 
{
	public static void main(String[] args) 
	{
		
		double input[]=new double[4];
		input[0]=14;
		input[1]=16;
		input[2]=19;
		input[3]=10;
		double sum=0;
		for(int i=0;i<input.length;i++)
		{
		 sum=sum+input[i];
		 /*
		  * i=0,true,sum=0+14=14
		  * i=1,true,sum=14+16=30
		  * 
		  */
		}
		double average=sum/input.length;
		System.out.println("The average of values present in the array is ->" +average);
		
	}
}
