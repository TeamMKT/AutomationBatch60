package ab60;
public class Throwkeyword 
{
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException,StringIndexOutOfBoundsException
	{
		if(1>1)
		{
		throw new ArrayIndexOutOfBoundsException("Sorry but");
		}
		else
		{
		throw new StringIndexOutOfBoundsException("String Exception");
		}
	}
}
