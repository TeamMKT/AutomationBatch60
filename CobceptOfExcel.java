package ab60;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CobceptOfExcel 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		//step 1
		FileInputStream fs=new FileInputStream("E:\\MKTProject\\AutomatioBatch55\\ExcelSheet\\excelsheet.xlsx");
			
		//step 2
					WorkbookFactory.create(fs);
		
		
		URL url=new URL("https://www.google.com");
		
		
		/*for(int i=0;i<10;i++)
		{
			Thread.sleep(2000);
			System.out.println(i);
		}
		*/
	
	}
}
