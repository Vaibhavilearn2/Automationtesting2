package Excelfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getrowsize {
	public static void main (String[]args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Vaibhavi Nighvekar\\Desktop\\Job Ready\\Seleniumexcel.xlsx");
  int rowsize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;
  System.out.println(rowsize);
	}


}
