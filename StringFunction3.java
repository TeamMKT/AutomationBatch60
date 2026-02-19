package ab60;
public class StringFunction3 
{
	public static void main(String[] args) 
	{
		String a="auto";
		//check if the string starts with a
			boolean b1=	a.matches("a(.*)");
			System.out.println(b1);
			//check if the string ends with o
			boolean b2=	a.matches("(.*)o");
	System.out.println(b2);
				
		//check if the string has exact 4 letters
	boolean b3=	a.matches("....");
	System.out.println(b3);
				
		//check if String has https in it or not		
String url="https://www.google.com";
			url.matches("https(.*)");
	}
}
