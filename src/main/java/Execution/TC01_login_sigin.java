package Execution;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import AllPages.Login_Page;
public class TC01_login_sigin extends Login_Page
{

//	public static void main(String[] args) {
//	
//		appplication_launch();
//	    
		
	//EnterEmailID("Testing@gmail.com");
		
    //EnterPassword("Pw4r23");
      
   // Sigin_login();
   // application_close();
	//}
//}
		public	static String ExcelEmailid="";
		public static 	String  ExcelPassword="";
			
		public static void main(String[] args)  throws IOException 
		{
			
				//String path = "D:\\Testdata.xlsx";
				//path of file
				FileInputStream fs = new FileInputStream("D:\\Testdata.xlsx");
				//we are declaring the path of file	
				// xlsx-XSSF  and xls--hSSF
				XSSFWorkbook workbook = new XSSFWorkbook(fs);
				//to identify the selected sheet in workbook
				XSSFSheet sheet = workbook.getSheet("testdata");	
				
				int rows = sheet.getLastRowNum();
				for(int i = 1; i <= rows; i++) 
				{
					    XSSFRow row = sheet.getRow(i);		
						ExcelEmailid=	row.getCell(0).getStringCellValue();
						ExcelPassword=row.getCell(1).getStringCellValue();
						application_launch();	
				 
					EnterEmailID(ExcelEmailid);
			        EnterPassword(ExcelPassword);
			        Sigin_login();
			        application_close();
			        //done read program now onwards write...
			       String actual="Is this your account?";
			        // we have take from application via xpath.getText();       
			       String expected = "Is this your account?";
			       
			      // int cellCount = 
			       XSSFCell cell = row.createCell(sheet.getRow(i).getLastCellNum());
			       
			       if (actual.equals(expected))
			       {
			       System.out.println("Test case is passed"); 

		       cell.setCellValue("Passed");
			       } 
			       else
			       {
			       System.out.println("Test case is failed");

			       cell.setCellValue("Failed");
			       }

			   
				}
				 fs.close();
			       FileOutputStream fout = new FileOutputStream("D:\\Testdata.xlsx");
			       workbook.write(fout);
	       fout.close();
		}
		}

			       
		

