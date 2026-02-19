package ab60;
public class Amazon 
{
	Amazon(String a,char b)  //constructor (this keyword)
	{
		System.out.println("Constructor 3");
	}
	Amazon(char b,String a)  //constructor (this keyword)
	{
		System.out.println("Constructor 4");
	}
	public static void main(String[] args) 
	{
		Amazon a4=new Amazon('F',"Sita");
		Amazon a1=	new Amazon(100);//syntax of creating an Object
		Amazon a2=new Amazon();	
		Amazon a3=new Amazon("Ram",'M');
	}
	Amazon()  //constructor (this keyword)
	{
		System.out.println("Constructor 1");
	}
	Amazon(int a)  //constructor (this keyword)
	{
		System.out.println("Constructor 2");
	}
}
