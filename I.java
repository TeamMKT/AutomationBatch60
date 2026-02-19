package ab60;
class K
{
	static void launchQuit()
	{
		System.out.println("launching and closing Browser");
	}
}
class J extends K
{
	static void excelSheet()
	{
		System.out.println("Fetching the value from excel sheet");
	}
}
public class I extends J
{
	public static void main(String[] args) 
	{
		launchQuit();
		excelSheet();
	}
}
