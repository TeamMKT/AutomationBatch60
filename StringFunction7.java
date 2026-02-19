package ab60;
public class StringFunction7 
{
	public static void main(String[] args) 
	{
		String a="testing";
				
		
		System.out.println(a.replace('e', 'E'));
		
		String b="Manual Testing";
		System.out.println(b.replace("Manual", "API"));
		
		String c="Automation";
		
		//replace all smaller letters
		System.out.println(c.replaceAll("[a-z]", ""));

			
		//replace all capital letter	
		System.out.println(c.replaceAll("[A-Z]", ""));

		//replace all numeric value

		String d="k v no 2";
		System.out.println(d.replaceAll("[0-9]", ""));

	}
}
